package instagramOop;

public class BaseUser {
	private int id;
	private String profileImage;
	private String firstName;
	private String lastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProfileImage() {
		return profileImage;
	}

	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BaseUser() {
		super();
	}

	public BaseUser(int id, String profileImage, String firstName, String lastName) {
		super();
		this.id = id;
		this.profileImage = profileImage;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	

}
