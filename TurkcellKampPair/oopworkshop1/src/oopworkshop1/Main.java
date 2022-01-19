package oopworkshop1;

public class Main {

	public static void main(String[] args) {
	
		Course course1= new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0");
		Course course2= new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (Java + ANGULAR)","https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/qi4s19xSKCmtaaRUqUFI");
		Course course3= new Course(3,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript + ANGULAR)","https://process.fs.teachablecdn.com/ADNupMnWyR7kCWRvm76Laz/resize=width:705/https://www.filepicker.io/api/file/Zk7d1MdoSJ6cEShVbfd0");

		Category category= new Category(1, "Programlama");
		
		Instructor instructor1= new Instructor(1,"Engin Demiroğ");
		Instructor instructor2= new Instructor(2,"Emrullah Aşgaroğlu");
		
		course1.setCategory(category);
		course1.setInstructors(new Instructor[]{instructor1,instructor2});
		
		course2.setCategory(category);
		course2.setInstructors(new Instructor[]{instructor1});
		
		course3.setCategory(category);
		course3.setInstructors(new Instructor[] {instructor2});
		
		Course[] courses=  {course1,course2,course3};
		
		for(Course course: courses)
		{
			System.out.println(course.getName());
			for(Instructor i: course.getInstructors())
			{
				System.out.println(i.getName());
			}
			System.out.println(course.getCategory().getName());
		}
	}

}
