package instagramOop;

public class Posts extends BasePage{
	private String[] Posts;
	

	public String[] getPosts() {
		return Posts;
	}


	public void setPosts(String[] posts) {
		Posts = posts;
	}


	public Posts() {
		super();
	}


	public Posts(int id, String[] images, String[] posts) {
		super(id, images);
		Posts = posts;
	}
	

}
