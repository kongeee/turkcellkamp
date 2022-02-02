package exceptionHandlingWorkshop;

import exceptionHandlingWorkshop.business.businessException.BusinessException;
import exceptionHandlingWorkshop.business.concretes.UserManager;
import exceptionHandlingWorkshop.dataAccess.concretes.UserDaoImpl;
import exceptionHandlingWorkshop.entity.concretes.User;

public class Main {
	public static void main(String[] args ) {
		
		UserManager userManager = new UserManager(new UserDaoImpl());
		User user1 = new User(1,"y�ksel","�zt�rk","y@gmail","123456");
		User user2 = new User(2,"ay�e","t�rk","a@gmail","123456");
		User user3 = new User(3,"kerem","tun�","k@gmail","123456");
		User user4 = new User(4,"elif","�rk","e@gmail","123456");
		
		try {
			userManager.add(user1);
			userManager.add(user2);
			userManager.add(user3);
			userManager.add(user4);
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			userManager.login("y@gmail", "123456");
		} catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
	}
}
