package exceptionHandlingWorkshop.business.concretes;

import java.util.ArrayList;

import exceptionHandlingWorkshop.business.abstracts.UserService;
import exceptionHandlingWorkshop.business.businessException.BusinessException;
import exceptionHandlingWorkshop.dataAccess.abstracts.UserDao;
import exceptionHandlingWorkshop.entity.concretes.User;

public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public void add(User user) throws BusinessException {
		if(!nameAndSurnameControl(user.getName(),user.getSurName())){
			throw new BusinessException("Ad ve soyad 2 karakterden k���k olamaz!");
		} 
		else if(!passwordControl(user.getPassword())) {
			throw new BusinessException("�ifre 6 karakterden az olamaz!");
		}
		else if(!emailControl(user.getEmail())) {
			throw new BusinessException("Email format� yanl��!");
		}
		else if(!uniqueEmailControl(user.getEmail())) {
			throw new BusinessException("Email adresi zaten kay�tl�!");
		}
		else if(!emailLengthControl(user.getEmail())) {
			throw new BusinessException("Email bo� b�rak�lamaz");
		}
		else {
			userDao.add(user);
			System.out.println("Kullan�c� eklendi: "+ user.getName());
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Kullan�c� silindi: "+ user.getName());
	}

	@Override
	public ArrayList<User> getAll() {
		return userDao.getAll();
	}
	

	@Override
	public void login(String email, String password) throws BusinessException {
		for (User user : userDao.getAll()) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println(user.getName()+" kullan�c�s� ba�ar�yla giri� yapt�.");
			}
			else {
				throw new BusinessException("Email ya da �ifre hatal�. Giri� ba�ar�s�z!");
			}
		}
		
	}
	
	private boolean nameAndSurnameControl(String name,String surName) {
		if(name.length()<2 && surName.length()<2) {
			return false;
		}
		return true;
	}
	
	private boolean passwordControl(String password) {
		if(password.length()<6) {
			return false;
		}
		return true;
	}
	
	private boolean emailControl(String email) {
		if(!email.contains("@")) {
			return false;
		}
		return true;
	}
	
	private boolean uniqueEmailControl(String email) {
		for (User user : userDao.getAll()) {
			if(user.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}
	private boolean emailLengthControl(String email) {
		if(email.length()<1) {
			return false;
		}
		return true;
	}

	
	
	

}
