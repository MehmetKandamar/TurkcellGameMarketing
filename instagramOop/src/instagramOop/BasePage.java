package instagramOop;

public class BasePage {
	private int id;
	private String[] images;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public BasePage() {
		super();
	}

	public BasePage(int id, String[] images) {
		super();
		this.id = id;
		this.images = images;
	}
	

}
