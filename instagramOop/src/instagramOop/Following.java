package instagramOop;

public class Following extends BaseUser{
	private String[] directMessage;
	private String[] stories;
	private String unfollow;
	
	public String[] getDirectMessage() {
		return directMessage;
	}

	public void setDirectMessage(String[] directMessage) {
		this.directMessage = directMessage;
	}

	public String[] getStories() {
		return stories;
	}

	public void setStories(String[] stories) {
		this.stories = stories;
	}

	public String getUnfollow() {
		return unfollow;
	}

	public void setUnfollow(String unfollow) {
		this.unfollow = unfollow;
	}

	public Following() {
		super();
	}

	public Following(int id, String profileImage, String firstName, String lastName,String[] directMessage, String[] stories, String unfollow) {
		super(id, profileImage,firstName,lastName);
		this.directMessage = directMessage;
		this.stories = stories;
		this.unfollow = unfollow;
	}
	

}
