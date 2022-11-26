package hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		nbDigitalVideoDiscs++;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String toString() {
		return "DVD - " + title + " - " + category + " - " + director + " - "
                + length + " : " + cost + "$";
	}
	public boolean isMatch(String title) {
		return this.title.contains(title);
	}
}
