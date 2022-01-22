package workshop2;

public class Course {
	
	private int id;
	private String name;
	private String description;
	private String image;
	
	private Instructor[] instructors;
	private Student[] students;
	private Category category;
	

	public Course() {
		super();
	}
	
	public Course(int id, String name, String description, String image) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
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
	
	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	

}
