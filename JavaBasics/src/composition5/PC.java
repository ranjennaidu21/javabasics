package composition5;

public class PC {
	
	//PC has Motherboard , Monitor and Case ,so can use the class as below so that PC has direct access to variables and methods 
	//from that class
	private Motherboard myMotherboard;
	private Monitor myMonitor;
	private Case myCase;
	
	public PC(Motherboard myMotherboard, Monitor myMonitor, Case myCase) {
		this.myMotherboard = myMotherboard;
		this.myMonitor = myMonitor;
		this.myCase = myCase;
	}
	
	
	//Follow step by step 1-4 , to understand better how it is implemented
	
	//1. make all the following getmethod to private so that the Main class not able to access it directly.
	//   In order for the Main class to access they need to access it via a public method 
	//   where all the private method implemented internally as in 2
	/*
	public Motherboard getMotherboard() {
		return myMotherboard;
	}
	
	public Monitor getMonitor() {
		return myMonitor;
	}
	public Case getMyCase() {
		return myCase;
	}
	*/
	//=======================================================================//
	
	//2. After made it private and put all into the public method now we need to set the value so that it can replace the following valie
	// from the main clas:
	/*
	myPC.getMotherboard().runMotherboard("Dada");
	myPC.getMonitor().runMonitor(2,3);		
	myPC.getMyCase().runCase();
	*/ 
	//
	//
	/*
	public void getValues(){
		getMotherboard();
		getMonitor();
		getMyCase();
	}
	
	private Motherboard getMotherboard() {
		return myMotherboard;
	}
	
	private Monitor getMonitor() {
		return myMonitor;
	}
	private Case getMyCase() {
		return myCase;
	}
	*/
	
	//=======================================================================//
	
	//3. Now instead you can simplify the code and make it more readable by 
	//and call the return method directly to replace the following block of code
	//being called from the main method
	/*
	myPC.getMotherboard().runMotherboard("Dada");
	myPC.getMonitor().runMonitor(2,3);		
	myPC.getMyCase().runCase();
	*/ 
	//
	/*	
	public void getValues(){
		getMotherboard().runMotherboard("Dada");;
		getMonitor().runMonitor(2, 3);;
		getMyCase().runCase();;
	}
	
	
	private Motherboard getMotherboard() {
		return myMotherboard;
	}
	
	private Monitor getMonitor() {
		return myMonitor;
	}
	private Case getMyCase() {
		return myCase;
	}
	*/
	
	//=======================================================================//
	
	//4. You can remove the getter method and call the method directly from the class object declared above
	public void getValues(){
		myMotherboard.runMotherboard("Dada");
		myMonitor.runMonitor(2, 3);
		myCase.runCase();
		System.out.println("Mother board name: " + myMotherboard.getName());
	}
	//now you can remove these now as the getmethod as been replaced above
	/*
	private Motherboard getMotherboard() {
		return myMotherboard;
	}
	
	private Monitor getMonitor() {
		return myMonitor;
	}
	private Case getMyCase() {
		return myCase;
	}
	*/
	
	

}
