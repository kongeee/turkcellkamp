package nLayeredApp.dataAccess.concretes.hibernateImpls;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;


public class HibernateProductDao implements ProductDao {
	@Override
	public void add(Product product) {
		System.out.println("Hibernate kullanılarak eklendi :"+product.getName());
		
	}

	@Override
	public void update(Product product) {
		System.out.println("Hibernate kullanılarak güncellendi :"+product.getName());
		
	}

	@Override
	public void delete(Product product) {
		System.out.println("Hibernate kullanılarak silindi :"+product.getName());
		
	}

}
