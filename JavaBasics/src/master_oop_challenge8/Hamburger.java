package master_oop_challenge8;
// The purpose of the application is to help a ficticious company called Bills Burgers to manage
// their process of selling hamburgers.
// Our application will help Bill to select types of burgers, some of the additional items (additions) to
// be added to the burgers and pricing.
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in
// Bills store.
// The basic hamburger should have the following items.
// bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger. Each one of these items gets charged an additional
// price so you need some way to track how many items got added and to calculate the price (for the base
// burger and all the additions).
// This burger has a base price and the additions are all seperately priced.
// Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price.
public class Hamburger {
	private String name;
	private String meat;
	private double price;
	private String rollType;

	
	private String addition1Name;
	private double addition1Price;
	
	private String addition2Name;
	private double addition2Price;
	
	private String addition3Name;
	private double addition3Price;
	
	private String addition4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat,double price,String rollType) {
		this.name = name;
		this.meat=meat;
		this.price = price;
		this.rollType = rollType;
	}
	
	public void addAddition1(String name,double price){
		addition1Name = name;
		addition1Price = price;
	}
	
	public void addAddition2(String name,double price){
		addition2Name = name;
		addition2Price = price;
	}
	
	public void addAddition3(String name,double price){
		addition3Name = name;
		addition3Price = price;
	}
	
	public void addAddition4(String name,double price){
		addition4Name = name;
		addition4Price = price;
	}
	
	public double itemizeBurger(){
		System.out.println("The " + name + " with " + rollType + " roll is: " + price );
		
		if(addition1Name != null){
			System.out.println(addition1Name + " is added at: " + addition1Price);
			price += addition1Price;
		}
		if(addition2Name != null){
			System.out.println(addition2Name + " is added at: " + addition2Price);
			price += addition2Price;
		}
		if(addition3Name != null){
			System.out.println(addition3Name + " is added at: " + addition3Price);
			price += addition3Price;
		}
		if(addition4Name != null){
			System.out.println(addition4Name + " is added at: " + addition4Price);
			price += addition4Price;
		}
		return price;
		
	}
	
	
	
	
	
	
}
