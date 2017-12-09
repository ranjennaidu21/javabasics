package encapsulation;

public class PlayerWithoutEncapsulation {
	
	//test without encapsulation
	public String name;
	public int health;
	
	
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
