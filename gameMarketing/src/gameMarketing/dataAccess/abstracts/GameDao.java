package gameMarketing.dataAccess.abstracts;

import java.util.ArrayList;

import gameMarketing.entities.concretes.Game;


public interface GameDao {
	void add(Game game); //interface'lerde imza genelde public olur bu nedenle erişim belirteci yazmaya gerek duymadık.
	void delete(Game game);
	void update(Game game);
	
	Game get(int id);
	ArrayList<Game> getAll();
}
