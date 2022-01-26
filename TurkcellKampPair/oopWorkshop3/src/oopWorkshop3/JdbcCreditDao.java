package oopWorkshop3;

public class JdbcCreditDao implements CreditDao {

	@Override
	public void save(Credit credit) {
		System.out.println("JDBC kullanarak kredi eklendi : " + credit.getName());
		
	}

	@Override
	public void delete(Credit credit) {
		System.out.println("JDBC kullanarak kredi silindi : " + credit.getName());
		
	}

	@Override
	public void update(Credit credit) {
		System.out.println("JDBC kullanarak kredi güncellendi : " + credit.getName());
		
	}

}
