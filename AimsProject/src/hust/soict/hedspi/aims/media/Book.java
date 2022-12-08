package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	
	public Book(String title, String category, float cost, ArrayList<String> authors) {
		super(title, category, cost);
		this.authors = authors;
	}
	public boolean addAuthor(String authorname) {
		if(authors.contains(authorname)) {
			System.out.println("Author is already exist");
			return false;
		}
		authors.add(authorname);
		return true;
	}
	public boolean removeAuthor(String authorname) {
		if (authors.contains(authorname)) {
            authors.remove(authorname);
            return true;
        }
        System.out.println("Author is not exist");
        return false;
	}
	public String toString() {
		StringBuffer str = new StringBuffer();
        str.append("(Book): " + this.getTitle() + " - " + this.getCategory() + " - ");
        for (String author : authors) {
            str.append(author + ", ");
        }
        return str.toString() + ": " + this.getCost() + "$";
	}
}
