
package master_oop_challenge8;

// Also create two extra varieties of Hamburgers (classes) to cater for
// a) Healthy burger (on a brown rye bread roll), plus two addition items can be added.
// The healthy burger can have a total of 6 items (Additions) in total.
// hint:  you probably want to process the 2 additional items in this new class, not the base class,
// since the 2 additions are only appropriate for this new class.
public class Healthy extends Hamburger {
	// hint: you probably want to process the 2 additional items in this new
	// class, not the base class,
	// so add two additions in this class
	private String healthyExtraAdditionName1;
	private double healthyExtraAdditionPrice1;

	private String healthyExtraAdditionName2;
	private double healthyExtraAdditionPrice2;

	public Healthy(String meat, double price) {
		// as we already know the name and roll type for this Healthy burger ,
		// no need to pass arguments from the Hamburger class
		super("Healthy", meat, price, "Brown Rye");
	}

	// method to add Healthy Burger additions
	public void addHealthyaddition1(String name, double price) {
		this.healthyExtraAdditionName1 = name;
		this.healthyExtraAdditionPrice1 = price;
	}

	public void addHealthyaddition2(String name, double price) {
		this.healthyExtraAdditionName2 = name;
		this.healthyExtraAdditionPrice2 = price;
	}

	// override the itemizeBurger method from the Hamburger class and use the
	// total return from that method to add with this 2
	// Healthy burger specific additions
	@Override
	public double itemizeBurger() {
		// get the total from base Hambruger and add it with 2 extra additions
		// of this Healthy burger if present (not null)
		double healthyBurgerPrice = super.itemizeBurger();
		if (healthyExtraAdditionName1 != null) {
			healthyBurgerPrice += healthyExtraAdditionPrice1;
			System.out.println(healthyExtraAdditionName1 + " is added at: " + healthyExtraAdditionPrice1);
		}
		if (healthyExtraAdditionName2 != null) {
			healthyBurgerPrice += healthyExtraAdditionPrice2;
			System.out.println(healthyExtraAdditionName2 + " is added at: " + healthyExtraAdditionPrice2);
		}
		return healthyBurgerPrice;
	}

}
