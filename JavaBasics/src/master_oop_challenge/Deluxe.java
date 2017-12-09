package master_oop_challenge;

public class Deluxe extends Hamburger {
    // b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
    // hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
    // object is created, and then prevent other additions being made.
	public Deluxe() {
		super("Deluxe", "Sausage", 2.50, "White");
		//call the addAddition method from super class
		super.addAddition1("Chips", 1.50);
		super.addAddition2("Drinks", 1.50);
	}
	
	// object is created, and then prevent other additions being made.
	//override the addAddition1 class in Hamburger class to prevent other additions being made
	public void addAddition1(String name,double price){
		System.out.println("Other additions are not allowed for this Deluxe Burger");
	}
	public void addAddition2(String name,double price){
		System.out.println("Other additions are not allowed for this Deluxe Burger");
	}
	public void addAddition3(String name,double price){
		System.out.println("Other additions are not allowed for this Deluxe Burger");
	}
	public void addAddition4(String name,double price){
		System.out.println("Other additions are not allowed for this Deluxe Burger");
	}
	

}
