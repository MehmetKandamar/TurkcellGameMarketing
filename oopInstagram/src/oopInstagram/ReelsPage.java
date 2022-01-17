package oopInstagram;

public class ReelsPage extends BasePage{
	private String[] reels;
	private boolean like;
	private String[] comments;
	private String share;
	
	public String[] getReels() {
		return reels;
	}

	public void setReels(String[] reels) {
		this.reels = reels;
	}

	public boolean isLike() {
		return like;
	}

	public void setLike(boolean like) {
		this.like = like;
	}

	public String[] getComments() {
		return comments;
	}

	public void setComments(String[] comments) {
		this.comments = comments;
	}

	public String getShare() {
		return share;
	}

	public void setShare(String share) {
		this.share = share;
	}

	public ReelsPage() {
		super();
	}

	public ReelsPage(int id, String[] images, String[] reels, boolean like, String[] comments, String share) {
		super(id,images);
		this.reels = reels;
		this.like = like;
		this.comments = comments;
		this.share = share;
	}

}
