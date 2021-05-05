package Interfaces;

import Entities.Game;
import Entities.User;

public interface GameMarketService {
	void addGameforSale(Game game);
	void removeGamefromSale(Game game);
	void sellGame(Game game, User user);
}
