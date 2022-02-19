package com.turkcell.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.northwind.entities.concretes.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	Product getByProductName(String productName); //where kosulu calistirir
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);//prodcut name ve category icindeki category id degerlerine gore
	List<Product> getByCategoryIn(List<Integer> categories);
	List<Product> getByProductNameContains(String productName);
	List<Product> getByProductNameStartsWith(String productName);

	
}
