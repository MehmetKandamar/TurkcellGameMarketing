package gameMarketing.business.abstracts;

import gameMarketing.entities.concretes.Campaign;


public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
