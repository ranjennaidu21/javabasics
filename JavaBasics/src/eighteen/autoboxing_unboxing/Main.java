package eighteen.autoboxing_unboxing;

import java.util.ArrayList;

//We use autoboxing and unboxing when we wanted to pass primitive data type like int , double ,float into the 
//ArrayList
//AUTOBOXING -> converting a primitive type to an object wrapper
//UNBOXING -> getting the object wrapper and convert it back to primitive type

class IntClass {
	//called wrapper as we wrap the functionality
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //This will not work as type argument for ArrayList cannot be a primitive type
        //ArrayList<int> intArrayList = new ArrayList<int>();
        //So need a class reference , we can add a new IntClass class like above to use int as field with getter and setter
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));
        
        //We can do like above but it is little bit messy as need to create a new class each time
        //So easiest way is using wrapper object instead of primitive type object above like below
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);
        
        //You can also declare without using the new Integer word as above when declare:
        Integer integer2 = 56; // this is similar to Integer integer2 = Integer.valueOf(56); which will be done in background.
        //the below will automatically convert Integer wrapper object to int primitive type
        int myInt2 = integer2; // because it is similar to int myInt2 = integer2.intValue(); which will be done in background.
        System.out.println("Integer integer2: " + integer2);
        System.out.println("int myInt2: " + myInt2);
        


        //So now we can use the wrapper object in the arraylist for integer , double and other primitive data type
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<=10; i++) {
        	//to take the primitive int value and automatically convert it into  Integer wrapper object 
        	//we will use the valueOf method
        	//THIS IS AUTOBOXING -> converting a primitive type to an object wrapper 
            intArrayList.add(Integer.valueOf(i));
        }
        System.out.println();
    	System.out.println("intArrayList");
        for(int i=0; i<=3; i++) {
        	//THIS IS UNBOXING -> getting the object wrapper and convert it back to primitive type
        	//to get the Integer value we set above in primitive int value will use intValue() method
            //System.out.println(i + " --> " + intArrayList.get(i).intValue());
        	//but Java will automatically do it in background even if you ignore the inValue() method as below
            System.out.println(i + " --> " + intArrayList.get(i));
        }

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();
        System.out.println();
        System.out.println("doubleArrayList");
        for(double dbl=0.0; dbl<=1.5; dbl += 0.5) {
        	doubleArrayList.add(dbl);
        }

        for(int i=0; i<doubleArrayList.size(); i++) {
        	//UNBOXING from Double wrapper object to double primitive type
            //double value = doubleArrayList.get(i).doubleValue();
        	//Java will automatically do it in background even if you ignore the doubleValue() method as below
            double value = doubleArrayList.get(i);
            System.out.println(i + "  --> " + value);
        }

    }
}
