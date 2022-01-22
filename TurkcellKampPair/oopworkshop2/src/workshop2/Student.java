package workshop2;

public class Student extends User{
	
	private String schoolName;
	
	private Course[] courses;

	public Student() {
		super();
	}

	public Student(int id,String email,String password,String name,String schoolName) {
		super(id,email,password,name);
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
	

}
