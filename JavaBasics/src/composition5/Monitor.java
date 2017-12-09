package composition5;

public class Monitor {
	
	private String model;
	//Monitor have the resolution object from the Resolution class
	private Resolution resolution;
	
	public Monitor(String model, Resolution resolution) {
		this.model = model;
		this.resolution = resolution;
	}
	
	public void runMonitor(int x,int y){
		System.out.println("Monitor is running at: " + x + " and " + y + " px");
	}
	
	
	public String getModel() {
		return model;
	}
	public Resolution getResolution() {
		return resolution;
	}
	

	
	

}
