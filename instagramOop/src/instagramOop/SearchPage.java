package instagramOop;

public class SearchPage extends BasePage{
	private String search;
	

	public String getSearch() {
		return search;
	}


	public void setSearch(String search) {
		this.search = search;
	}


	public SearchPage() {
		super();
	}


	public SearchPage(int id, String[] images, String search) {
		super(id, images);
		this.search = search;
	}
	

}
