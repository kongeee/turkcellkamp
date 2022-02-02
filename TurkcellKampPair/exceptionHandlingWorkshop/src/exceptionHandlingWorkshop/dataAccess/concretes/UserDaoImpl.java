package exceptionHandlingWorkshop.dataAccess.concretes;

import java.util.ArrayList;

import exceptionHandlingWorkshop.dataAccess.abstracts.UserDao;
import exceptionHandlingWorkshop.entity.concretes.User;

public class UserDaoImpl implements UserDao{
	
	ArrayList<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);	
	}

	@Override
	public void delete(User user) {
		users.remove(user);
	}

	@Override
	public ArrayList<User> getAll() {	
		return users;
	}

}
