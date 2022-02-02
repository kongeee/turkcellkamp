package exceptionHandlingWorkshop.dataAccess.abstracts;

import java.util.ArrayList;

import exceptionHandlingWorkshop.entity.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	ArrayList<User> getAll();
}
