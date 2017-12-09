package core;

public class FloatDouble {

	public static void main(String[] args) {
		//Float and double are similar but double are: more precise , faster , used by most of the inbuilt functions(sin,cos,tan,etc)
		int myInt = 5;
		//if you just put the decimal number , java will assume it as double by default. So you need to cast it to float
		float myFloat = (float)5.4;
		float myFloat2 = 2f; //put f to represent float. Not wrong if didn't put , but just not recommended.
		double myDouble = 2d; //put d to represent double.
		
		//you can see double is more precise
		//8 bytes
		float myFloat3 = myInt/3f;
		//16 bytes
		double myDouble2 = myInt/3d;
		System.out.println(myFloat3);
		System.out.println(myDouble2);
		
		//Exercise
		//Convert a given number of pounds to kilogram (1 pound = 0.45359237kg)
		//1. Create variable to store number of pounds
		double pound = 0.45359237d;
		//2. Calculate number of Kilograms for the number above and store it in a variable
		double kilogram = (1/pound);
		//3. Print out the result
		System.out.println("Converted Kilograms: " + kilogram);
		
		//From JAVA 7 onwards you can use underscore to make the value more readable
		int testInt = 5_239_029;
		double testDouble = 45_676.45_343d;
		System.out.println("testInt: "+ testInt);
		System.out.println("testDouble: " + testDouble);

	}

}
