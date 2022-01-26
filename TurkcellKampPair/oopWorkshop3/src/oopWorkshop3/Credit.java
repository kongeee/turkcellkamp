package oopWorkshop3;

public class Credit {

	private int id;
	private String name;
	private double minPrice;
	private double maxPrice;

	public Credit() {
		super();
	}

	public Credit(int id, String name, double minPrice, double maxPrice) {
		super();
		this.id = id;
		this.name = name;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
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

	public double getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

	public double getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(double maxPrice) {
		this.maxPrice = maxPrice;
	}

}
