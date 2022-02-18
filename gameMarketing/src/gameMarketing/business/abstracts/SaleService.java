package gameMarketing.business.abstracts;

import gameMarketing.entities.concretes.Sale;

public interface SaleService {
	void add(Sale sale);
	void delete(Sale sale);
}
