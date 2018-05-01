package twentytwo.abstractclass;

public class Main {

	//Abstract class focuses on what need to be done rather than how it being done. Similar to interface
	//Difference with interface are:
	//abstract class cannot be instantiate and will have mix of methods with and without implementations
	//abstract class can extend only one parent class but can implement multiple interfaces
	//abstract class can have constructors but interface cannot
	//abstract class can have any visibility of the fields(public/private) but interface automatically it is public
	//abstract class can have defined methods with implementation , but all methods in interface is abstract as all the 
	//implementation code need to be in the class that implements it. 
	
	//When to use abstract class:
	//When base class need to provide default implementation of certain methods but other methods should be open
	//to being overriden by child classes
	//So purpose of abstract class is to provide common definiton of a base class that multiple derived class can share
	
	//When to use interface
	//When expect many unrelated classes will implement your interface
	//When you want to specify behavior of particular data type without concering who implements that behavior
	//When to want to separate different behavior
	//eg: Collection API have List interface and implementations ArrayList , LinkedList.
	//Another eg: JDBC API , where concrete implementations provided by JDBC Drivers. This enable us to write all JDBC Code 
	//independent of the database(db) vendor
	
	//In this case , the Animal is a abstract class which extended by all the animals
	//Without abstract class all the Animal have choice to implement the methods declared in the parent Animal class
	//by overriding it. But for abstract class all the class should implements all the abstract methods declared in the Animal class
	
	//So in order to extend the Animal class , other class that extends it should be abstract or it should implements all the methods 
	//in the Animal class
	
	
    public static void main(String[] args) {
    	System.out.println("Dog class:");
	    Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
    	System.out.println();
        //Once the bird is declared as abstract class , it cannot be directly instantiate as below.
        //Bird bird = new Bird("Test");
        
        //So we need to instantiate the class that extends this abstract class
    	System.out.println("Parrot class");
        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    	System.out.println();

    	System.out.println("Penguin class");
        Penguin penguin = new Penguin("Emperor");
        penguin.breathe();
        penguin.eat();
        penguin.fly();
    	System.out.println();
    }
}
