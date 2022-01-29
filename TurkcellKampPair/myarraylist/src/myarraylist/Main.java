package myarraylist;


public class Main {

	public static void main(String[] args) {
		MyArrayList<String> myArrayList = new MyArrayList<String>();
		myArrayList.add("deneme1");
		myArrayList.add("deneme2");
		myArrayList.add("deneme3");
	
		
		myArrayList.remove(1);
		
		
		myArrayList.add("deneme4");
		myArrayList.add("deneme7");
		
		for(int i=0; i<myArrayList.size(); i++) {
			System.out.println(myArrayList.getValue(i));
		}
		
		System.out.println("Size of the MyArrayList is " + myArrayList.size());
		

	}

}
