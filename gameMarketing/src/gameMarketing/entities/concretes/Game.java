package gameMarketing.entities.concretes;

import gameMarketing.entities.abstracts.Entity;

/*eğer bir nesnemiz varsa bu nesneyi grupladığımızı ve onun ne
 *  anlama geldiğini her zaman sisteme anlatmak gereklidir.*/
/* Eğer bir class herhangi bir inheritance, implementasyon almıyorsa 
 * ileride illaki problem yaşanacaktır*/
//interface'ler referans tutuculardır.
//Java'da başka bir paketteki sınıfı, interface'yi abstract sınıfı kullanmak istersek onu "import" etmek gerekli.


public class Game implements Entity{
	private int id;
	private String name;
	private double price;
	private String description;
	
	public Game() {
		super();
	}

	public Game(int id, String name, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
