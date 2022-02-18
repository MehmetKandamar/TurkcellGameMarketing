package gameMarketing.entities.concretes;

import gameMarketing.entities.abstracts.Entity;

public class Campaign implements Entity{
	private int id;
	private String campaignName;
	private int discountPercentage;
	
	public Campaign() {
		super();
	}

	public Campaign(int id, String campaignName, int discountPercentage) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(int discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
}
