package hust.soict.hedspi.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public Track() {
		
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());	
	}
	
	public boolean equals(Object obj) {
		return this.length == ((Track) obj).length && this.title == ((Track) obj).title;
	}
	
	public String toString() {
		return this.getTitle() + " - " + this.getLength();
	}
}
