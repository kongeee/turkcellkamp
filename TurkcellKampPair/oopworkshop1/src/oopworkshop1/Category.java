package oopworkshop1;

public class Category {
	private int id;
	private String name;
	private Course[] courses;
	
	public Category() {
			
		}
	
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}
}
