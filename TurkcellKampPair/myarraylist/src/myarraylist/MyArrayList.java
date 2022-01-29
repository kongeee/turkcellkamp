package myarraylist;

public class MyArrayList<T> {
	private T[] array;
	private int size = 0;
	
	
	public MyArrayList() {
		array = (T[])(new Object[size]);
	}
	
	public void add(T item) {
		if(this.size == 0) {
			this.size++;
			this.array = (T[])(new Object[size]);
			this.array[0] = item;
			T[] tempArray = this.array.clone();
			
			return;
			
		}
		this.size++;
		T[] tempArray = this.array.clone();
		this.array = (T[])(new Object[size]);
		for(int i = 0; i<tempArray.length; i++) {
			this.array[i] = tempArray[i];
		}
		this.array[size-1] = item;
		
	}
	
	public int size() {
		return this.size;
	}
	
	public void remove(int index) {
		if(index<0 || index>=this.size) {
			System.out.println("Error");
			return;
		}
		
		for(int i = index; i<this.size-index; i++) {
			this.array[i] = array[i+1];
		}
		this.size--;
		
	}
	
	public T getValue(int index) {
		
		return this.array[index];
	}

}
