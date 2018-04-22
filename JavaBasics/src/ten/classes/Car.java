package ten.classes;

public class Car {
//class is template/blueprint of object
	
	//member variables/ fields
	private int doors;
	private int wheels;
	private String model;
	private String engine;
	private String colour;

	public void setModel(String model) {
		//advantage of using set method is that you can validate the value before set it.
		String validModel = model.toLowerCase();
		if (validModel.equals("porsche") || validModel.equals("commodore")) {
			//if you see both this class member variable and parameter of this function using same name model
			//so to differentiate it we use this keyword. this.model is referring to the model member of this Car class.
			this.model = model;
		} else {
			this.model = "Unknown";
		}
	}

	public String getModel() {
		return this.model;
	}

}

