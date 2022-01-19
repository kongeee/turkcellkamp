package oopworkshop1;

public class Course 
{
	private int id;
	private String name;
	private String imagePath;
	private Instructor[] instructors;
	private Category category;
	
	public Course(){
		
	}
	
	public Course(int id, String name, String imagePath) {
		super();
		this.id = id;
		this.name = name;
		this.imagePath = imagePath;
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
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	public Instructor[] getInstructors() {
		return instructors;
	}
	public void setInstructors(Instructor[] instructors) {
		this.instructors = instructors;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
}