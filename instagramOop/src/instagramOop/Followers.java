package instagramOop;


public class Followers extends BaseUser{
	private String[] directMessage;
	private String remove;
	
	public String[] getDirectMessage() {
		return directMessage;
	}

	public void setDirectMessage(String[] directMessage) {
		this.directMessage = directMessage;
	}

	public String getRemove() {
		return remove;
	}

	public void setRemove(String remove) {
		this.remove = remove;
	}

	public Followers() {
		super();
	}

	public Followers(int id, String profileImage, String firstName, String lastName, String[] directMessage, String remove) {
		super(id, profileImage,firstName,lastName);
		this.directMessage = directMessage;
		this.remove = remove;
	}
	
	

}
