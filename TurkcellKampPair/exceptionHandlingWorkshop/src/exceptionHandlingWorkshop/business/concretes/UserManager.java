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
			throw new BusinessException("Ad ve soyad 2 karakterden küçük olamaz!");
		} 
		else if(!passwordControl(user.getPassword())) {
			throw new BusinessException("Þifre 6 karakterden az olamaz!");
		}
		else if(!emailControl(user.getEmail())) {
			throw new BusinessException("Email formatý yanlýþ!");
		}
		else if(!uniqueEmailControl(user.getEmail())) {
			throw new BusinessException("Email adresi zaten kayýtlý!");
		}
		else if(!emailLengthControl(user.getEmail())) {
			throw new BusinessException("Email boþ býrakýlamaz");
		}
		else {
			userDao.add(user);
			System.out.println("Kullanýcý eklendi: "+ user.getName());
		}
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		System.out.println("Kullanýcý silindi: "+ user.getName());
	}

	@Override
	public ArrayList<User> getAll() {
		return userDao.getAll();
	}
	

	@Override
	public void login(String email, String password) throws BusinessException {
		for (User user : userDao.getAll()) {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				System.out.println(user.getName()+" kullanýcýsý baþarýyla giriþ yaptý.");
			}
			else {
				throw new BusinessException("Email ya da þifre hatalý. Giriþ baþarýsýz!");
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
