package gameMarketing.dataAccess.concretes;

import java.util.ArrayList;

import gameMarketing.dataAccess.abstracts.GameDao;
import gameMarketing.entities.concretes.Game;

public class OracleGameDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("Oracle ile eklendi : "+ game.getName());
		
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
	public Game get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Game> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
