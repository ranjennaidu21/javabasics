package fourteen.encapsulation;


public class Main {

    public static void main(String[] args) {
		//Encapsulation is a mechanism that restrict access to certain components in the objects you are creating
    	
    	//example of without encapsulation , you can see we can access the Player class field and method directly 
    	//as it is public
	    Player player = new Player();
	    //Let say we change the fullName field name to name internally in Player class.
	    //This class will be affected and showing error here as well
	    // player.name = "Tim";
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());
        //here you can control the health directly which is not good and we wanted to restrict/control this value from directly assign it
        player.health = 30;
        player.loseHealth(damage);
        System.out.println("Remaining health =  " + player.healthRemaining());
        
        //----------------------------//
        //Now let's use encapsulation to give more control over this things. 
        //Added another class EnhancedPlayer to show the differences between both
        
       //the only way to set the fields is via constructor for this EnhancedPlayer class
       //if health in not from 1-100 we will set the value to 10 which declared in the class else it will print whatever the value
       //we set for the health field in the constructor below.
       EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 200, "Sword");
       EnhancedPlayer enhancedPlayer2 = new EnhancedPlayer("Babu", 10, "Knife");
       //You can see now we cannot access the field directly as we assigned them as scope of private
       //enhancedPlayer.health
       System.out.println();
       //so getter is the only mechanism to retrieve that value
       //so let say we change the field name of health to myHealth in the EnhancedPlayer class , the code will still work as
       //we use getHealth() method to retrieve it and it is still the same name.
       System.out.println("Initial health for EnhancedPlayer1 is " + enhancedPlayer.getHealth()); //100
       System.out.println("Initial health for EnhancedPlayer2 is " + enhancedPlayer2.getHealth()); //10
    }
}
