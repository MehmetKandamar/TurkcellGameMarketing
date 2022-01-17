package instagramOop;

class ProfilePage extends BasePage{
	private String firstName;
	private String lastName;
	private String bio;
	Followers [] followers;
	Following [] following;
	
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

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Followers[] getFollowers() {
		return followers;
	}

	public void setFollowers(Followers[] followers) {
		this.followers = followers;
	}

	public Following[] getFollowing() {
		return following;
	}

	public void setFollowing(Following[] following) {
		this.following = following;
	}

	public ProfilePage() {
		super();
	}

	public ProfilePage(int id, String[] images, String firstName, String lastName, String bio, Followers[] followers, Following[] following) {
		super(id, images);
		this.firstName = firstName;
		this.lastName = lastName;
		this.bio = bio;
		this.followers = followers;
		this.following = following;
	}
	
	
	

}
