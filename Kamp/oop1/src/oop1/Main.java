package oop1;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Telefon");
		
		Product product1 = new Product(1, "IPhone 12", 12000, 1500, new String[] {"image1", "image2", "image3"});
		product1.setCategory(category1);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("IPhone 13");
		product2.setUnitPrice(12000);
		product2.setDiscount(1500);
		product2.setImages(new String[] {"image1", "image2", "image3"});
		product2.setCategory(category1);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("IPhone 14");
		product3.setUnitPrice(12000);
		product3.setDiscount(1500);
		product3.setImages(new String[] {"image1", "image2", "image3"});
		product3.setCategory(category1);
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
	}

}
