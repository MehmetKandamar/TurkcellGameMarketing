package gameMarketing.dataAccess.concretes.hibernateImpls;

import gameMarketing.dataAccess.abstracts.SaleDao;
import gameMarketing.entities.concretes.Sale;

public class HibernateSaleDao implements SaleDao{

	@Override
	public void add(Sale sale) {
		System.out.println("Hibernate ile eklendi : "+ sale.getId());
		
	}

	@Override
	public void delete(Sale sale) {
		System.out.println("Hibernate ile silindi : "+ sale.getId());
		
	}

}
