import Concrete.CampaignManager;
import Concrete.GameMarketManager;
import Concrete.UserIdentificationManager;
import Concrete.UserManager;
import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class Main {

	public static void main(String[] args) {
		GameMarketManager gameMarketManager = new GameMarketManager();
		UserManager userManager = new UserManager();
		CampaignManager campaignManager = new CampaignManager();
		UserIdentificationManager identificationManager = new UserIdentificationManager();
		
		Game game1 = new Game(1, "dota2", 10); 
		System.out.println(game1.getPrice());
		Campaign campaign1 = new Campaign(1, "çýlgýn kampanya", 20, game1);
		
		User user1 = new User(1, "mert", "altun", 27, "12345", "@", "123455", "levi", "1234");
		userManager.signUp(user1);
		userManager.signIn(user1);
		gameMarketManager.addGameforSale(game1);
		campaignManager.addCampaign(campaign1);
		gameMarketManager.sellGame(game1, user1);
	
	}
}
