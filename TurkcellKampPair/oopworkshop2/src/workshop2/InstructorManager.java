package workshop2;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println("Added instructor :" + instructor.getName());
	}
	
	public void update(Instructor instructor) {
		System.out.println("Updated instructor :" + instructor.getName());
	}

	public void delete(Instructor instructor) {
		System.out.println("Deleted instructor :" + instructor.getName());
	}

}
