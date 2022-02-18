package gameMarketing.dataAccess.concretes.hibernateImpls;

import java.util.ArrayList;

import gameMarketing.dataAccess.abstracts.GameDao;
import gameMarketing.entities.concretes.Game;

public class HibernateGameDao implements GameDao{

	@Override
	public void add(Game game) {
		System.out.println("Hibernate ile eklendi : "+ game.getName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Hibernate ile silindi : "+ game.getName());
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Hibernate ile güncellendi : "+ game.getName());
		
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
