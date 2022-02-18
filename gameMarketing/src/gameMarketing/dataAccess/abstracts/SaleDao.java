package gameMarketing.dataAccess.abstracts;

import gameMarketing.entities.concretes.Sale;

public interface SaleDao {
	void add(Sale sale);
	void delete(Sale sale);
}
