package thirteen.composition;

public class Main {

    public static void main(String[] args) {
		//Inheritence : is a relationship (Car is a Vehicle : Car extends vehicle)
		//Composition is has relationship (PC has monitor,motherboard)
		//For this example:
		//PC has Case,Monitor,Motherboard
		//Monitor has resolution (height,width)
		//Case has dimension (height,width,depth)
    	
	    Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        //you can create the class on the fly like Resolution above if you are not going to use the variables for anything else,
        //if you just wanted to pass it to a method

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        //how to access drawPixelAt method of Monitor from PC
        thePC.getMonitor().drawPixelAt(1500, 1200, "red" );
        //how to access loadProgram method of Motherboard from PC
        thePC.getMotherboard().loadProgram("Windows 1.0");
        //how to access pressPowerButton method of Case from PC
        thePC.getTheCase().pressPowerButton();
    }
}
