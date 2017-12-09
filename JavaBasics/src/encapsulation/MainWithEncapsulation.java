package encapsulation;

public class MainWithEncapsulation {

	public static void main(String[] args) {
		PlayerWithEncapsulation player = new PlayerWithEncapsulation("Bob", 50);
		//now you have control of the health value and cannot assign it from this main method as it declared private 
		//player2.health = 2;
		int damage =9;
		System.out.println("Player1 initial Health is: " + player.getRemainingHealth());
		player.minusHealth(damage);
		System.out.println("Player1 remaining Health after minus " + damage +  " is: " + player.getRemainingHealth());
		
		PlayerWithEncapsulation player2 = new PlayerWithEncapsulation("Mark", 300);
		//test with another player where health is 300.
		//this will print 100 as it per the validation in the constructor of the PlayerWithEncapsulation Class
		damage =20;
		System.out.println("Player2 initial Health is: " + player2.getRemainingHealth());
		player2.minusHealth(damage);
		System.out.println("Player2 remaining Health after minus " + damage +  " is: " + player2.getRemainingHealth());

	}

}
