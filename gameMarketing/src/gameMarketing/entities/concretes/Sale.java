package gameMarketing.entities.concretes;

import gameMarketing.entities.abstracts.Entity;

public class Sale implements Entity{
	private int id;
	private User user;
	private Game game;
	private Campaign campaign;
	
	public Sale() {
		super();
	}

	public Sale(int id, User user, Game game, Campaign campaign) {
		super();
		this.id = id;
		this.user = user;
		this.game = game;
		this.campaign = campaign;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	
}
