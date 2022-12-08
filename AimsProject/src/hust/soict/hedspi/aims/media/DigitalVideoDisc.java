package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{
	
	public DigitalVideoDisc(String title, String category, String director, int length,float cost) {
		super(title, category, cost, length, director);
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, cost);
	}
	public String toString() {
        return "(Digital Dvd): " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$";
    }
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
}
