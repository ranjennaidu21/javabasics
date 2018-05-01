package twentyone.innerclass;

import java.util.ArrayList;

//base class is the Gearbox
public class GearboxWithPublicInnerClass {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    //private int gearNumber = 0; renamed to currentGear to avoid confusion with inner class

    public GearboxWithPublicInnerClass(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }


    //this is the inner class
    //instance of Gear class have all the access to outer class evnethough marked as private
    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
        	//this is referring to the class that currently we are in Gear. Not the outer class
            this.gearNumber = gearNumber;
            //If you want to refer to gearNumber in outerclass Gearbox use as below
            //Gearbox.this.gearNumber;
            //Recommended the gearNumber in outerClass is changed to currentGear above to avoid confusion
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        public double driveSpeed(int revs) {
            return revs *( this.ratio);
        }
    }
}
