package gameMarketing;

import gameMarketing.business.abstracts.GameService;

import gameMarketing.business.concretes.GameManager;
import gameMarketing.dataAccess.concretes.OracleGameDao;
import gameMarketing.entities.concretes.Game;

public class Main {

	public static void main(String[] args) {
		
		//interface'ler somut sınıfların referansını tutabilir.
		//Bir projede entity'ler hariç "new" yapıyorsak ileride problem yaşanacaktır.
		
		GameService gameService = new GameManager(new OracleGameDao());//Burada sağ taraf bir Manager ve sol taraf bir interface, bu noktada GameService GameManager'in referansını tutuyor.
		
		Game game = new Game();
		game.setId(1);
		game.setName("Clash of clans");
		
		gameService.add(game);
	}

}
