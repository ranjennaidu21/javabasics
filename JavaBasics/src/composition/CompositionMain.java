// Composition is used when there is has relationship between the object
// This is different from inheritance where you can only extend one class, but for composition you can create
//as much as class you want and access all the methods it via the main big class(contained by)
package composition;

public class CompositionMain {

	public static void main(String[] args) {
		//For this example:
		//PC has Motherboard , Monitor , Case
		//Monitor has resolution (height,width)
		//Case has dimension (height,width,depth)
		
		Motherboard motherboard = new Motherboard("Asus","Intel",23);
		
		Resolution res = new Resolution(12,34);
		//need to send Resolution object in this paramater so need to initialize the value by creating Resolution object and use 
		//it in the parameter as below
		Monitor mon = new Monitor("Dell",res);
		
		//you can declare the myDime value as below which is same as the Resolution object used above
		/*
		Dimension myDime = new Dimension(3,2,3);
		Case mycase = new Case("WD",myDime);
		*/
		//OR
		//initialize the value Dimension object directly as below
		Case mycase = new Case("WD",new Dimension(3,2,3));
		
		//Now create a PC object which can access get all the values and methods from all three Classes above 
		//As PC has all three classes and we already pass their object as reference to the PC class
		//pass all the object above as argument to the PC class
		PC myPC =  new PC(motherboard, mon, mycase);
		//A.now you can access get all the values and methods from all three Classes above
		/*
		myPC.getMotherboard().runMotherboard("Dada");
		myPC.getMonitor().runMonitor(2,3);		
		myPC.getMyCase().runCase();
		*/
		//This is possible before as it is referring to the value (will not work if A has been replaced with B and the getName method has made private)
		//System.out.println("Mother board name: " + myPC.getMotherboard().getName());
		
		//A has been replaced with B, where all the access for methods in A has been changed to private(encapsulation)
		//and implemented in a public method getValues so that can be access from this method
		//the output is same as A
		myPC.getValues();
		
		//This is not possible as it is referring to the object
		//System.out.println("Monitor resolution: " + myPC.getMonitor().getResolution());
		//System.out.println("Case dimension: " + myPC.getMyCase().getDimension());
		
		
		

	}

}
