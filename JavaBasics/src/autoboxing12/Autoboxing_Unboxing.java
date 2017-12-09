//Wrapper without Autoboxing is just to show how to use wrapper class without 
//Autoboxing or Unboxing to use primitive data type in ArrayList

//It is recommended to always use this Autoboxing and Unboxing method instead of that


package autoboxing12;

import java.util.ArrayList;

public class Autoboxing_Unboxing {

	public static void main(String[] args) {
		System.out.println("=========myIntAryList1=========");
		ArrayList<Integer> myIntAryList = new ArrayList<Integer>();
		//create an Integer variable using the Integer class
		Integer myInti = new Integer(23);
		//add that value into the myIntAryList then
		myIntAryList.add(myInti);
		//to print the value use the intValue method after get the position as below
		//System.out.println(myIntAryList.get(0).intValue());
		//the intValue can be ignored as java will automatically add the intValue 
		//in the background
		System.out.println(myIntAryList.get(0));
		System.out.println();
		System.out.println("=========myIntAryList2=========");

		//Autoboxing
		//Let say you wanted to convert the int primitive type to Integer class
		//you can do as below which is called as Autoboxing
		int myInt1 = 32;
		//the valueof method will convert the primitive int value myInt1 to Integer class
		Integer myInt2 = Integer.valueOf(myInt1);
		Integer myInt3 = Integer.valueOf(96);
		//Even if you didnt mention the valueOf method , java will automatically
		//convert the primitive int value to Integer class value as below
		Integer myInt4 = 77; // same as Integer myInt4 = Integer.valueOf(77);
		
		ArrayList<Integer> myIntAryList2 = new ArrayList<Integer>();
		//add both of the values above into the myIntAryList2 ArrayList
		myIntAryList2.add(myInt2);
		myIntAryList2.add(myInt3);
		myIntAryList2.add(myInt4);
		//to print both of the value above
		//this method is call Unboxing as it get the value from the Integer class
		//and return it as an primitive data type int
		System.out.println(myIntAryList2.get(0).intValue());
		System.out.println(myIntAryList2.get(1).intValue());
		//the intValue can be ignored as java will automatically add the intValue 
		//in the background
		System.out.println(myIntAryList2.get(2));
		System.out.println();
		System.out.println("=========myIntAryList2=========");
		
		//same goes to other primitive type , (double,float,short,long) etc
		ArrayList<Double> myDoubleAryList = new ArrayList<Double>();
		for(double i = 0.00;i<=10.0;i+=0.5){
			//same as myDoubleAryList.add(Double.valueOf(i));
			myDoubleAryList.add(i);
		}
		
		for(int i=0;i<myDoubleAryList.size();i++){
			//same as System.out.println(i + "-->" + myDoubleAryList.get(i).doubleValue());
			System.out.println(i + "-->" + myDoubleAryList.get(i));
		}
		
	}

}
