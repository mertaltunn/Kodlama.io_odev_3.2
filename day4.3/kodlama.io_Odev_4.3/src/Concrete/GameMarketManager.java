package Concrete;

import Entities.Game;
import Entities.User;
import Interfaces.GameMarketService;

public class GameMarketManager implements GameMarketService{

	@Override
	public void addGameforSale(Game game) {
		System.out.println(game.getName() + "  added to the system");
		
	}

	@Override
	public void removeGamefromSale(Game game) {
		System.out.println(game.getName() + "  removed from the system");
		
	}

	@Override
	public void sellGame(Game game, User user) {
		Game[] gList = {game};
		user.setGames(gList);
		
		System.out.println(game.getName() + " sold to " + user.getLastname());
		
	}

}
