package arrays9;

import java.util.Scanner;

public class ArraysWithMethods {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Use getIntegers() method to get numbers from user to determine the array length
		//Then ask input from user to enter all the values for x number of times entered which received from getIntegers() method
		//Use getAverage() create another method to get average of that x numbers
		System.out.println("Enter number of values you want allocate to array:");
		int values = scanner.nextInt();
		int[] myRealArray = getIntegers(values);
		printArray(myRealArray);
		System.out.println("The average is: " + getAverage(myRealArray));
	}
	
	//Use getIntegers() method to get numbers from user to determine the array length
	public static int[] getIntegers(int myInt){
		int[] myArray = new int[myInt];
		System.out.println("Please enter "+ myInt + " numbers");
		for(int i=0;i<myArray.length;i++){
			myArray[i]= scanner.nextInt();
		}
		return myArray;
	}
	
	//Use getAverage() create another method to get average of that 5 numbers
	public static double getAverage(int[] myArray){
		double sum=0;
		for(int i=0;i<myArray.length;i++){
			sum += myArray[i];
		}
		return (double)sum/(double)myArray.length; //(double) just to make sure all the value converted to double
	}
	
	public static void printArray(int[] myArray){
		for(int i=0;i<myArray.length;i++){
			System.out.println("Value " + i + " is " +myArray[i]);
		}
	}
	
	


}
