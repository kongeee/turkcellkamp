package oopWorkshop3;

public class HibernateCreditDao implements CreditDao{

	@Override
	public void save(Credit credit) {
		System.out.println("Hibernate kullanarak kredi eklendi : " + credit.getName());
		
	}

	@Override
	public void delete(Credit credit) {
		System.out.println("Hibernate kullanarak kredi silindi : " + credit.getName());
		
	}

	@Override
	public void update(Credit credit) {
		System.out.println("Hibernate kullanarak kredi güncellendi : " + credit.getName());
		
	}

}
