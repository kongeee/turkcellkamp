package workshop2;

public class Instructor extends User{
	
	private String bankNumber;
	
	private Course[] courses;
	
	public Instructor() {
		super();
	}
	
	public Instructor(int id,String email,String name,String password,String bankNumber) {
		super(id,email,password,name);
		this.bankNumber = bankNumber;
	}

	public String getBankNumber() {
		return bankNumber;
	}

	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	
}
