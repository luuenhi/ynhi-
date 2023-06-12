package AimsProject.src.hust.dsai.aims.media;

import java.util.Comparator;

public class Media {
	private int id;
	private String title;
	private String category;
	protected static float cost;
	

	public static final Comparator<hust.soict.dsai.aims.media.Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	public Media(String title) {
		this.title = title;
	}
	
	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	
	public Media(int id2, String title,String category, float cost2) {
		this.title = title;
		this.category = category;
	}
	
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
	public static float getCost() {
		try {
			return cost;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}
	

}
