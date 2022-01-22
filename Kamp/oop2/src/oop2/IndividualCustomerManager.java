package oop2;

public class IndividualCustomerManager {
	public void add(IndividualCustomer customer) {
		System.out.println("Added " + customer.getFirstName());
	}
	
	public void update(IndividualCustomer customer) {
		System.out.println("Updated " + customer.getFirstName());
	}
	
	public void delete(IndividualCustomer customer) {
		System.out.println("Deleted " + customer.getFirstName());
	}
}
