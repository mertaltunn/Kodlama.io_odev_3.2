package Concrete;

import Entities.Campaign;
import Entities.Game;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		campaign.game.setFinalPrice(campaign.game.getPrice()*campaign.getCampaingDiscountPercent()/100);
		System.out.println(campaign.getCampaingName() + " campaign is created!" );
	}

	@Override
	public void updateCampaign(Campaign campaign, int discountPercent) {
		campaign.setCampaingDiscountPercent(discountPercent);

		campaign.game.setFinalPrice(campaign.game.getPrice()*campaign.getCampaingDiscountPercent()/100);

		System.out.println(campaign.getCampaingName() + "'s discount percent is updated!" );
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Campaign removed");
		
	}

}
