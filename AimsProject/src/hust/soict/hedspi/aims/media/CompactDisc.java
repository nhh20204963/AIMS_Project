package hust.soict.hedspi.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	public String getArtist() {
		return artist;
	}
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public CompactDisc(String title, String category, float cost, int length, String director, String artist,
			ArrayList<Track> tracks) {
		super(title, category, cost, length, director);
		this.artist = artist;
		this.tracks = tracks;
	}
	public boolean addTrack(Track track) {
		 if(tracks.contains(track)) {
			 System.out.println("Track is already exist");
			 return false;
		 }
		 tracks.add(track);
		 return true;
	}
	public boolean removeTrack(Track track) {
		 if(tracks.contains(track)) {
			 tracks.remove(track);
			 return true;
		 }
		 System.out.println("Track is not exist");
		 return false;
	}
	public  int getLength() {
		 int length = 0;
		 for(int i = 0; i < tracks.size(); i++) {
			 length += tracks.get(i).getLength();
		 }
		 
		 System.out.println("The length of CD is " + length);
		 return length;
	}
	public void play() {
		System.out.println("Artist: " + this.getArtist());
		for(int i = 0; i < tracks.size(); i++) {
			tracks.get(i).play();
		}
	}
	
	public String toString() {
		StringBuffer str = new StringBuffer();

        str.append("(Compact Dvd): " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - "
                + this.getLength() + " : " + this.getCost() + "$: Track: ");
        for (Track track : tracks) {
            str.append(track.toString() + ", ");
        }
        return str.toString();
	}
	 
}
