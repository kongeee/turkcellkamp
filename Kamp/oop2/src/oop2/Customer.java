package oop2;

public class Customer {
	private int id;
	private String customerNumber;
	private String email;
	public Customer() {
		super();
	}
	public Customer(int id, String customerNumber, String email) {
		super();
		this.id = id;
		this.customerNumber = customerNumber;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
