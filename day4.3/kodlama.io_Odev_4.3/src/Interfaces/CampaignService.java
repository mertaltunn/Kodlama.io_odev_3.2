package Interfaces;

import Entities.Campaign;
import Entities.Game;

public interface CampaignService {
	void addCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign, int discountPercent);
	void deleteCampaign(Campaign campaign);
}
