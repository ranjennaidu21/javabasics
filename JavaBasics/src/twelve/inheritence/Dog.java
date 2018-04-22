package twelve.inheritence;

//the extends keyword let this class to inherit all the state and methods of the Animal class
public class Dog extends Animal{
	
	//state specific to this Dog class / additional states for this Dog class
	private int eyes;
	private int tail;
	private String name;
	
	public Dog(String category,int brain,int eyes,int tail,String name){
		//initialize all the common variables from the super class 
		//this can be done using super keyword which refer to the class that this class extended from and 
		//arguments to pass to that super class constructor
		
		//the brain and category will let you maintain the value that is sent from the Animal constructor
		//if you want to add any value specific to this Dog class from the super class constructor , 
		//then add value to the super class constructor parameter as below :size=50 and weight=50
		//you dont have to add the size and weight parameter above as it already declared in the super class constructor
		
		//super is referring to the class we inherited this class from (Animal)
		//constructor can have call to super or this but not both.
		//super and this cannot be used in static area ()
		
		// important : super must be first statement in each constructor
		super(category,brain,50,50); //super constructor , cannot use this() constructor		
		//for variables specific to this Dog class
		this.eyes=eyes;
		this.tail=tail;
		this.name=name;
	}
	
	//you can call the override method declared in the super class as below
	public void move(){
		System.out.println("Dog move() called");
		//you can also call the move method from the super class(Animal) using the super keyword as below
		super.move();
		
/*		super is referring to the super class of this Class which extended from
		you can add super infront if you have same method name and want to call method from the superclass 
		instead of move method from this(Dog) class*/

	}
	
	//method specific for this Dog class
	public void chew(){
		System.out.println("Dog chew() called");
	}

	public int getEyes() {
		return eyes;
	}

	public int getTail() {
		return tail;
	}

	public String getName() {
		return name;
	}
	
	
}
