package gameMarketing.business.abstracts;

import java.util.ArrayList;

import gameMarketing.entities.concretes.Game;

//Eğer "Service" görürsek anlamalıyız ki o iş sınıfının interface'si.
public interface GameService {
	void  add(Game game);
	void  delete(Game game);
	void  update(Game game);
	ArrayList<Game> getAll();
}
