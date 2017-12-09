package composition5;

public class Case {
	
	private String brand;
	private Dimension dimension;
	
	public Case(String brand, Dimension dimension) {
		this.brand = brand;
		this.dimension = dimension;
	}
	
	public void runCase(){
		System.out.println("Case is running");
	}

	public String getBrand() {
		return brand;
	}

	public Dimension getDimension() {
		return dimension;
	}
	
	
}
