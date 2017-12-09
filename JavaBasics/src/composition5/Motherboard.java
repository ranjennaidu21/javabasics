package composition5;

public class Motherboard {
	private String name;
	private String processor;
	private int ramSpeed;
	
	public Motherboard(String name, String processor, int ramSpeed) {
		this.name = name;
		this.processor = processor;
		this.ramSpeed = ramSpeed;
	}
	
	public void runMotherboard(String programName){
		System.out.println("Motherboard is running and the program name is: " +programName);
	}

	public String getName() {
		return name;
	}

	public String getProcessor() {
		return processor;
	}

	public int getRamSpeed() {
		return ramSpeed;
	}
	
	
	
	
}
