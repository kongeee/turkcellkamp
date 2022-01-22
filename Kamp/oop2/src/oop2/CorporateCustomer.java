package oop2;

public class CorporateCustomer extends Customer{
	
	private String companyName;
	private String taxNumber;
	public CorporateCustomer() {
		super();
	}
	public CorporateCustomer(int id, String companyName, String taxNumber, String customerNumber, String email) {
		super(id, customerNumber, email);
		this.companyName = companyName;
		this.taxNumber = taxNumber;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTaxNumber() {
		return taxNumber;
	}
	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
	
	
}
