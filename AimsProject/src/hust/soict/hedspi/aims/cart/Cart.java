package hust.soict.hedspi.aims.cart;
import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class Cart {
	
	private int qtyOrdered = 0;
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered ++;
			System.out.println("The disc has been added!");
		}
		else {
			System.out.println("The cart is almost full!");
		}
		
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for(int i = 0; i < qtyOrdered; ++i) {	
			if(itemsOrdered[i] == disc) {		
				for(int j = i; j < qtyOrdered; ++j) {
					itemsOrdered[j] = itemsOrdered[j+1];	
					if(j == qtyOrdered-1) {
						itemsOrdered[j] = null;
					}
				}
			qtyOrdered --;
			break;
			}
		}
	}
	
	public float totalCost() {
		float sum = 0.0f;
		
		for(int i = 0; i < qtyOrdered; ++i) {
			sum += itemsOrdered[i].getCost();
		}
		
		return sum;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
        for (int i = 0; i < dvdList.length; ++i) {
            addDigitalVideoDisc(dvdList[i]);
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        addDigitalVideoDisc(dvd1);
        addDigitalVideoDisc(dvd2);
    }
    
	public void printCart() {
        System.out.println("***********************CART***********************\nOrdered Items:");
        for (int i = 0; i < qtyOrdered; ++i) {
            System.out.println(i + 1 + ". " + itemsOrdered[i].toString() + "\n");
        }
        System.out.println("Total cost: " + totalCost() + "\n***************************************************");

    }
}