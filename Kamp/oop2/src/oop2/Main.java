package oop2;

public class Main {

	public static void main(String[] args) {
		CorporateCustomer corporateCustomer1 = new CorporateCustomer(1, "Turkcell", "123456", "123", "info@turkcell.com");
		
		IndividualCustomer individualCustomer1 = new IndividualCustomer(2, "Furkan", "Ekici", "123456", "654", "furkan@furkan.com");
		
		Customer[] customer = {corporateCustomer1, individualCustomer1};
		
		IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager();
		individualCustomerManager.add(individualCustomer1);
	}

}
