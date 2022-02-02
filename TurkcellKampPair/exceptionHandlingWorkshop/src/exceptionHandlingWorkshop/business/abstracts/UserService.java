package exceptionHandlingWorkshop.business.abstracts;

import java.util.ArrayList;

import exceptionHandlingWorkshop.business.businessException.BusinessException;
import exceptionHandlingWorkshop.entity.concretes.User;

public interface UserService {
	void add(User user) throws BusinessException;
	void delete(User user);
	ArrayList<User> getAll();
	void login(String email, String password) throws BusinessException;
}
