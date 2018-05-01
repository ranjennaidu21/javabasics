package twentyone.innerclass;

public class Main {

    public static void main(String[] args) {
    	
    	//Non-static nested class or inner class
    	//useful as doesn't make a sense to refer to a class without an outer class
    	
    	System.out.println("Start of Public Inner Class");
    	//1) Test for inner class with Public 
	    GearboxWithPublicInnerClass mcLaren = new GearboxWithPublicInnerClass(6);
	    
	    //to create the Gear Class which is innerclass of Gearbox , we need to create like this
	    //note that we used the Gearbox instance mcLaren created above to create the innerclass Gear
	    //will give error if you create Gear object without instance of Gearbox
	    
	    GearboxWithPublicInnerClass.Gear first = mcLaren.new Gear(1, 12.3);
        //both of the below code will not work.
	        //GearboxWithPublicInnerClass.Gear second = new GearboxWithPublicInnerClass.Gear(2, 15.4); 
	        //GearboxWithPublicInnerClass.Gear third = new mcLaren.Gear(3, 17.8);
	    
        System.out.println(first.driveSpeed(1000));
    	System.out.println("End of Public Inner Class");
    	System.out.println();
        
        
    	System.out.println("Recommended: Start of Private Inner Class");
        //2) use this way when the Gear inner class is private now. Now we will use the changeGear() and addGear() methods 
	    //in the Gearbox to create the Gear class rather than directly creating it.
    	GearboxWithPrivateInnerClass mcLaren2 = new GearboxWithPrivateInnerClass(6);
    	mcLaren2.operateClutch(true);
    	mcLaren2.changeGear(1);
    	mcLaren2.operateClutch(false);
    	System.out.println(mcLaren2.wheelSpeed(1000));
    	mcLaren2.changeGear(2);
    	System.out.println(mcLaren2.wheelSpeed(3000));
    	mcLaren2.operateClutch(true);
    	mcLaren2.changeGear(3);
    	mcLaren2.operateClutch(false);
    	System.out.println(mcLaren2.wheelSpeed(6000));
    	System.out.println("Recommended: End of Private Inner Class");
    }
}
