package nLayeredApp.business.concretes;

import nLayeredApp.dataAccess.abstracts.ProductDao;
import nLayeredApp.entities.concretes.Product;

public class ProductManager {
	private ProductDao productDao;
	
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void add(Product product) {
		//iş kuralı kodları
		//ürün ismi tekrar edemez, ürün fiyatı>0 olmalı gibi..
		
		
		this.productDao.add(product);
	}
	
	public void update(Product product) {
		
		
		this.productDao.update(product);
	}
	
	public void delete(Product product) {
		
		
		this.productDao.delete(product);
	}
}
