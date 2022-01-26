package oop3;
//interfaces
public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager(new JdbcProductDao());
		Product product = new Product(1, "Elma", 15, 1, new String[] {});
		
		productManager.add(product);
	}

}
