package encapsulation6;

public class MainWithoutEncapsulation {

	public static void main(String[] args) {
		
		//NOT RECOMMEND APPROACH - Just an example to show BAD WAY without encapsulation
		//test without encapsulation
		PlayerWithoutEncapsulation playerWithoutEncapsulation = new PlayerWithoutEncapsulation();
		//this is not recommended as you can assign the value of the varaible from outside of the Player class.
		//This is hard if we change the variable name in the Player class for complex code.
		playerWithoutEncapsulation.name="Test";
		playerWithoutEncapsulation.health=10;
		
		int damage =9;
		System.out.println("Player health is: " + playerWithoutEncapsulation.health);
		playerWithoutEncapsulation.minusHealth(damage);
		System.out.println("Remaining Health after minus " + damage + " is: "+ playerWithoutEncapsulation.getRemainingHealth());
		
		// you can change the variable of the other class directly from here as well:
		playerWithoutEncapsulation.health = 102;
		damage = 104;
		System.out.println("Player health is: " + playerWithoutEncapsulation.health);
		playerWithoutEncapsulation.minusHealth(damage);
		System.out.println("Remaining Health after minus " + damage + " is: "+ playerWithoutEncapsulation.getRemainingHealth());
	

	}

}
