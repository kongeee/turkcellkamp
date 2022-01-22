package workshop2;

public class CourseManager {
	
	public void addStudent(Student student,Course course) {
		System.out.println("Course Name : "+ course.getName() + " Added Stundent : " + student.getName());
	}
	
	public void list(Course[] courses) {
		for(Course course:courses) {
			System.out.println(course.getName());
		}
	}
	
}
