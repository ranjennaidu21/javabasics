package classes2;

public class CarMain {

	public static void main(String[] args) {

			    Car porsche = new Car();
		        //not able to access directly as the variable is set to private. 
		        //porsche.model = "Carrera";
			    
			    //Need to use setter and getter methods (Encapsulation).
                porsche.setModel("porsche");
                System.out.println("Model is " + porsche.getModel());
		        

	}

}
