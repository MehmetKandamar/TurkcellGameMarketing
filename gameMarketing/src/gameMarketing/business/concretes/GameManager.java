package gameMarketing.business.concretes;

import java.util.ArrayList;

import gameMarketing.business.abstracts.GameService;
import gameMarketing.dataAccess.abstracts.GameDao;
import gameMarketing.entities.concretes.Game;

public class GameManager implements GameService{

	private GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		this.gameDao.add(game);
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Game> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
