package nLayeredApp.dataAccess.abstracts;

import nLayeredApp.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
}
