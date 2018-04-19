package eight.methods.methodoverloading;

public class MethodOverloading {

	//method overloading is same method name with different parameters
	public static void main(String[] args) {
		testMethod();
		int myInt = testMethod(12);
		String myText = testMethod("Ranjen", 21);
		System.out.println(myInt);
		System.out.println(myText);
	}
	
	public static void testMethod(){
		System.out.println("Testing method");
	}
	

	public static int testMethod(int number){
		int newNumber = number * 2;
		return newNumber;
	}
	
	public static String testMethod(String name,int number){
		String myText = "My name is " + name + " and the number is: " + number;
		return myText;
	
	//this will still show as duplicate eventhough use different return type for same method and parameter
	/*
	public static void testMethod(int number){
		System.out.println("Number is: " + number);
	}
	*/

	}

}
