package oop3;

public class JdbcProductDao implements ProductDao {

	@Override
	public void add(Product product) {
		System.out.println("JDBC kullanarak eklendi :"+product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("JDBC kullanarak g�ncellendi :"+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("JDBC kullanarak silindi :"+product.getName());
		
	}

}
