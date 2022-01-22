package workshop2;

public class Main {
	
	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Java", "Java Dersleri", "image");
		
		Course course2= new Course(2, "C#", "C# Dersleri", "image");
		
		Instructor instructor1 = new Instructor(1, "mail@mail.com", "Engin Demiroğ", "123", "1234");
		
        Student student1 = new Student(2, "student@student.com", "123a", "Murat", "Mersin");
		
		Student student2 = new Student(3, "student@student.com", "123a", "Furkan", "Çukurova");
		
		Student student3 = new Student(4, "student@student.com", "123a", "Öznur", "Kocaeli");
		
		CategoryManager categoryManager = new CategoryManager();
		
		StudentManager studentManager = new StudentManager();
		
		CourseManager courseManager = new CourseManager();
		
		InstructorManager instructorManager = new InstructorManager();
		
		User[] users = new User[] {instructor1,student1,student2,student3};
		
		Course[] courses = new Course[] {course1,course2};
		
		instructor1.setCourses(new Course[]{course1,course2});
		
		course1.setInstructors(new Instructor[] {instructor1});
		
		course2.setInstructors(new Instructor[] {instructor1});
		
		course1.setStudents(new Student[] {student1,student2,student3});
		
		for(User user:users) {
			System.out.println(user.getName());
		}
		
		for(Student student:course1.getStudents()) {
			System.out.println("Course1 Students : "+student.getName());
		}
		
		categoryManager.add(new Category(5, "Yazılım"));
		
		studentManager.add(student3);
		
		courseManager.addStudent(student3, course2);
		
		courseManager.list(courses);
		
		instructorManager.delete(instructor1);
	
		
	}

}
