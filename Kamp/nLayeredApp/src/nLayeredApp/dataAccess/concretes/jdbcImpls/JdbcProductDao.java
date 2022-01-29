package nLayeredApp.dataAccess.concretes.jdbcImpls;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class JdbcProductDao implements ProductDao {
	
	@Override
	public void add(Product product) {
		System.out.println("JDBC kullanarak eklendi :"+product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("JDBC kullanarak güncellendi :"+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("JDBC kullanarak silindi :"+product.getName());
		
	}

}
