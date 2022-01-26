package oopWorkshop3;

public class DbLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Db ile eklendi " + message);
	}

}
