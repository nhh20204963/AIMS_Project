package hust.soict.hedspi.aims;

import java.util.Scanner;

import javax.management.loading.PrivateClassLoader;

import hust.soict.hedspi.aims.cart.Cart;
import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.store.Store;

public class Aims {

	public static void showMenu() {
		System.out.println("AIMS");
		System.out.println("--------------------");
		System.out.println("1.View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------");
		System.out.println("Please choose a number: 0-1-2-3");
	}

		public static void storeMenu() {
			System.out.println("Options: ");
			System.out.println("--------------------");
			System.out.println("1. See a media's details");
			System.out.println("2. Add a media to cart");
			System.out.println("3. Play a media");
			System.out.println("4. See current cart");
			System.out.println("0. Back");
			System.out.println("--------------------");
			System.out.println("Please choose a number: 0-1-2-3-4");
		}
			public static void mediaDetailsMenu() {
				System.out.println("Options: ");
				System.out.println("-------------------");
				System.out.println("1. Add to cart");
				System.out.println("2. Play");
				System.out.println("0. Back");
				System.out.println("--------------------");
				System.out.println("Please choose a number: 0-1-2");
			}
		public static void cartMenu() {
			System.out.println("Options: ");
			System.out.println("--------------------");
			System.out.println("1. Filter medias in cart");
			System.out.println("2. Sort medias in cart");
			System.out.println("3. Remove media from cart");
			System.out.println("4. Play a media");
			System.out.println("5. Place order");
			System.out.println("0. Back");
			System.out.println("--------------------");
			System.out.println("Please choose a number: 0-1-2-3-4-5");
		}
	public static void main(String[] args) {
		Cart cart = new Cart();
		Store store = new Store();
		data(store);
		showMenu();
		Scanner ipShowMenu = new Scanner(System.in);
		switch (ipShowMenu.nextInt()) {
			case 1:
				viewStore(store, cart);
				break;
			case 2:
				updateStore(store);
				break;
			case 3:
				cart.printCart();
				handleCartMenu(cart);
				break;
			case 0:
				break;
		}
	}
	private static void data(Store store) {
        store.addMedia(new DigitalVideoDisc("The Lion king", "Animation", "A. Pepter", 120, 20.0f));
        Book book1 = new Book("This book title", "Scifi", 15.6f);
        book1.addAuthor("Betty");
        book1.addAuthor("Betty's daughter");
        Book book2 = new Book("Harry Potter", "Adventure", 27.3f);
        book2.addAuthor("JK.Rowling");
        Book book3 = new Book("The Hobbit", "Adventure", 21.6f);
        book3.addAuthor("JR.Tolkien");
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(book3);
        store.addMedia(new DigitalVideoDisc("The Avengers", "Hero", "Tom Holand", 134, 24.0f));
        CompactDisc d1 = new CompactDisc("Midnight", "Pop", 12.4f, 0, "Taylor", "Taylor Swift", null);
        d1.addTrack(new Track("Midnight rain", 20));
        d1.addTrack(new Track("Snow on the beach", 15));
        CompactDisc d2 = new CompactDisc("Folkerlore", "Rock", 11.4f, 0, "Brave", "Blake", null);
        d2.addTrack(new Track("Stay", 12));
        d2.addTrack(new Track("Move on", 11));
        store.addMedia(d1);
        store.addMedia(d2);
    }
	private static void viewStore(Store store, Cart cart) {
		store.printStore();
		storeMenu();
		Scanner ipViewStore = new Scanner(System.in);
		switch (ipViewStore.nextInt()) {
			case 1:
				System.out.print("Enter title of media: ");
                ipViewStore.nextLine();
                String st1 = ipViewStore.nextLine();
                Media res1 = store.searchStore(st1);
                if (res1 != null) {
                    System.out.println(res1.toString());
                    mediaDetailsMenu();
                    handleDetailsMenu(res1, cart);
                } else {
                    System.out.println("Not found");
                }
				break;
			case 2:
				System.out.print("Enter title of media: ");
                ipViewStore.nextLine();
                String st2 = ipViewStore.nextLine();
                Media res2 = store.searchStore(st2);
                if (res2 != null && cart.addMedia(res2)) {
                    System.out.println("Add " + res2.getTitle() + " to cart");
                    System.out.println("Current cart have " + cart.getQty() + " medias");
                } else {
                    System.out.println("Not found");
                }
				break;
			case 3:
				System.out.print("Enter title of media: ");
                ipViewStore.nextLine();
                String st3 = ipViewStore.nextLine();
                Media res3 = store.searchStore(st3);
                if (res3 != null) {
                    res3.play();
                } else {
                    System.out.println("Not found");
                }
				break;
			case 4:
				cart.printCart();
				break;
			case 0:
				break;
		}
	}
	
	private static void handleCartMenu(Cart cart) {
        while (true) {
            cartMenu();
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.print("Filter medias in cart by id/title ? (0:1): ");
                int option = input.nextInt();
                if (option == 1) {
                    System.out.print("Enter title: ");
                    input.nextLine();
                    String st = input.nextLine();
                    cart.filterByTitle(st);
                } else {
                }
            }
            if (choice == 2) {
                System.out.print("Sort medias in cart by title/cost ? (0:1): ");
                int option = input.nextInt();
                if (option == 1) {
                    cart.sortCartByCost();
                    cart.printCart();
                } else {
                    cart.sortCartByTitle();
                    cart.printCart();
                }
            }
            if (choice == 3) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = cart.searchCart(st);
                if (res != null) {
                    cart.remove(res);
                    System.out.println("Deleted " + res.getTitle());
                    cart.printCart();
                } else {
                    System.out.println("Not found");
                }
            }
            if (choice == 4) {
                System.out.print("Enter title of media: ");
                input.nextLine();
                String st = input.nextLine();
                Media res = cart.searchCart(st);
                if (res != null) {
                    res.play();
                } else {
                    System.out.println("Not found");
                }
            }
            if (choice == 5) {
                System.out.println("An order is created!");
                cart.newCart();
            }
            if (choice == 0) {
                System.out.println("Exit cart view");
                break;
            }
        }
    }
	
	private static void updateStore(Store store) {
        System.out.println("Delete a media from store");
        System.out.print("Enter title of media: ");
        Scanner ipUpdate = new Scanner(System.in);
        String st = ipUpdate.nextLine();
        Media res = store.searchStore(st);
        if (res != null) {
            store.removeMedia(res);
            System.out.println("Deleted " + res.getTitle());
        } else {
            System.out.println("Not found");
        }
    }
	
	private static void handleDetailsMenu(Media res, Cart cart) {
        Scanner input5 = new Scanner(System.in);
        int choice = input5.nextInt();
        if (choice == 1) {
            if (cart.addMedia(res)) {
                System.out.println("Add " + res.getTitle() + " to cart");
            }
        }
        if (choice == 2) {
            res.play();
        }
        if (choice == 0) {
            System.out.println("Exit media details view");
        }
    }
}
