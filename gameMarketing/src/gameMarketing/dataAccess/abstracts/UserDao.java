package gameMarketing.dataAccess.abstracts;

import gameMarketing.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	
}
