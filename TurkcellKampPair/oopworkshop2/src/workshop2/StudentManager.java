package workshop2;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println("Added Student" + student.getName());
	}
	
	public void update(Student student) {
		System.out.println("Updated Student" + student.getName());
	}
	
	public void delete(Student student) {
		System.out.println("Deleted Student" + student.getName());
	}

}
