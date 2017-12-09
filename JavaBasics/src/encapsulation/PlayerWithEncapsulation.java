package encapsulation;

public class PlayerWithEncapsulation {
	private String name;
	//can assign default value of health to 100
	private int health = 100;
	
	//create constructor to initialize the variable value when called and don't have to assign each of the value in the main method 
	public PlayerWithEncapsulation(String name, int health) {
		this.name = name;
		//take the value from the main method only if it met certain condition , if not set the default health value=100
		if(health>=0 && health<=200){
			this.health = health;
		}
	}
	
	public void minusHealth(int damage){
		if(health<=0){
			System.out.println("Player knockout");
		}
		this.health = this.health - damage;
	}
	
	public int getRemainingHealth(){
		return this.health;
	}
	
	
	
}
