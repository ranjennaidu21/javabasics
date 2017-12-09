package autoboxing;

import java.util.ArrayList;

//called wrapper where we wrap the myIntValue into a class so that it is not
//publicly available for other class
class myIntClass{
	private int myIntValue;
	
	public myIntClass(int myIntValue){
		this.myIntValue = myIntValue;
	}

	public int getMyIntValue() {
		return myIntValue;
	}

	//need to know why we put setter here when we are not using it - Pending questions
	//What if you need to set the value of myIntValue after the initial constructor call?
	//With a constructor you can only set it once, at object creation time.  
	//a Setter can be called anytime.
	public void setMyIntValue(int myIntValue) {
		this.myIntValue = myIntValue;
	}
	
	public String toString(){
		return String.valueOf(this.myIntValue);
	}
	
	
}

public class Wrapper_without_Autoboxing {

	public static void main(String[] args) {
		
		//default array - just to recall how to create arrays
		String[] myStringAry = new String[5];
		int[] myIntAry = new int[2];
		
		//ArrayList for string we can create and add as below
		ArrayList<String> myStringAryList = new ArrayList<String>();
		//we can directly add the elements to the String arrayList as below
		myStringAryList.add("Tim");
		System.out.println(myStringAryList.get(0));
		
		//but for primitive data type we cannot do the same as String above.
		//This is because the above is only applicable for class (String is a class)
		//ArrayList<int> myIntArrayList = new ArrayList<int>();
		
		//so for that we need to create a new class(which is called wrapper class)
		//which will add a integer using constructor , getter and setter as above
		ArrayList<myIntClass> myIntArrayList = new ArrayList<myIntClass>();
		myIntArrayList.add(new myIntClass(51));
		
		
		//without the toString method you will get autoboxing.myIntClass@15db9742
		//WHY CANNOT get the value - Pending questions 
		/*
		 * 1. The reason is you are trying to "print" your myIntClass class.
		 * What do you imagine it should print out?  
		 * How does Java know how to print the object?
		 * With a String you can just print that and it works, 
		 * no different when you have the String in an ArrayList.
		 * The numbers like @15db9742 is a representation of the object in memory,
		 * because you have not specified a toString method for a class.
		 * To see this work, add this to your myIntClass
		 @Override
		public String toString() {
    	return String.valueOf(this.myIntValue);
		}
		*/
		System.out.println(myIntArrayList.get(0));
		
		
		//Instead of above you can use as shown in the 
		//AutoBoxing_Unboxing class in this package
		
		

	}

}
