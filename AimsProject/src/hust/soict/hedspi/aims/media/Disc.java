package hust.soict.hedspi.aims.media;

public class Disc extends Media{
	protected int length;
	protected String director;
	public Disc(String title) {
		super(title);
	}
	public Disc(String title, String category, float cost, int length, String director) {
		super(title, category, cost);
		this.length = length;
		this.director = director;
	}
	
	public Disc(String title, String category, float cost, String director) {
		super(title, category, cost);
		this.director = director;
	}
	
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}

	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	@Override
	public String toString() {
		return "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$";
	}
	
	public boolean isMatch(String title) {
		return this.getTitle().contains(title);
	}
	
}
