package sixteen.arrays;

public class Arrays {

	public static void main(String[] args) {
		//Array store list of values with same datatype
		double[] myDoubleArray = new double[2]; //just to show we can create array for other data type also
		int[] myIntArray = new int[3];
		//[] added after the datatype, name of the array, new int[3] referring to number of values that can assigned to the array 
		//starts from 0 (0,1,2) , anything beyond this will give ArrayIndexOutOfBoundsException
		
		//assigning value to array
		myIntArray[1] = 2;
		//get array value
		System.out.println(myIntArray[1]);
		
		System.out.println("==========A==========");
		
		//Another alternative and simplese way to create array and assign value at same time
		int[] myIntArray2 = {1,2,3,4};
		System.out.println(myIntArray2[2]);
		System.out.println("=========B=========");
		
		//the easiet way to declare and assign array value is using for loop as below
		int[] myIntArray3 = new int[3];
		//can use myIntArray3.length instead of hardcoded value like 3 in the for loop below
		for(int i=0;i<myIntArray3.length;i++){
			myIntArray3[i] = i * 2;
		}	
		printArray(myIntArray3);
		//to print the array result you can also create it as a method so that we can just pass the array as arguments
		
			
	}
	
	public static void printArray(int[] myArray){
		for(int i=0;i<myArray.length;i++){
			System.out.println("Value " + i + " is " +myArray[i]);
		}
	}
}
