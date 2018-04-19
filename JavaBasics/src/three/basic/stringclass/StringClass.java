package three.basic.stringclass;

public class StringClass {

	public static void main(String[] args) {
		// previously we saw there was 8 primitive data types:
		// byte,int,short,long,float,double,char,boolean

		// String is not a primitive datatype but is a class.
		// You can just treat it as a ninth primitive datatype

		String myString = "Hello";
		System.out.println(myString);
		// you can concatenate another String and assign to the same variable
		// using the '+' symbol
		myString = myString + " " + "My name is Ranjen, \u00A9 2016";
		System.out.println(myString);

		// 123 is String
		String myString2 = "123";
		int myInt = 23;
		// This will convert the myInt to String automatically as it is
		// concatenating with an String
		myString2 = myString2 + myInt;
		System.out.println("myString2: " + myString2);
		// same goes to other primitive type
		myString2 = myString2 + 23.44d;
		System.out.println(myString2);

	}

}
