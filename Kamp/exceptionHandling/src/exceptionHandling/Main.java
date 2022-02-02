package exceptionHandling;

public class Main {

	public static void main(String[] args) {
		try {
			String[] cities = {"Anakara", "İsntabul", "İzmir"};
			cities[3] = "Adana";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} catch(Exception e) {
			System.out.println("Bir hata oluştu");
		} finally {
			
		}
		
		
		ProductManager productManager = new ProductManager();
		
		
		try {
			productManager.add("Elma");
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
