package gameMarketing.dataAccess.concretes.hibernateImpls;

import gameMarketing.dataAccess.abstracts.UserDao;
import gameMarketing.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi : "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile eklendi : "+ user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile eklendi : "+ user.getFirstName());
		
	}

}
