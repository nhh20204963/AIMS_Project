package hust.soict.hedspi.aims.media;

import java.util.Comparator;

import hust.soict.hedspi.aims.compare.MediaComparatorByCostTitle;
import hust.soict.hedspi.aims.compare.MediaComparatorByTitleCost;
public abstract class Media {
	
	protected int id;
	protected String title;
	protected String category;
	protected float cost;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public Media() {
		
	}
	public Media(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public Media(String title) {
		this.title = title;
	}
	
	public boolean equals(Object obj) {
		return this.title == ((Media) obj).title;
	}
	public boolean isMatch(String st) {
		if(this.title.equals(st)) {
			return true;
		}
		return false;
	}
	public abstract void play();
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
}
