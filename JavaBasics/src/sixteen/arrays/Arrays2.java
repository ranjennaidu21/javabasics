package sixteen.arrays;

import java.util.Scanner;

public class Arrays2 {
	//real life example , where user can input some value and this program will sum up and average all the values entered 
    //System.in allow you to input into the console that get return back to the program
	private static Scanner scanner = new Scanner(System.in);
    

    public static void main(String[] args) {
    	//create getIntegers method that will ask user to input 5 numbers, then return that 5 numbers and store that
    	//into this myIntegers array
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i +", typed value was " + myIntegers[i]);
        }
        
        //after get all the values entered above , we will find the average by passing the numbers of arrays above to
        //the getAverage method to sum and find the average
        System.out.println("The average is " + getAverage(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        // /r so that it you can enter the input in next line
        int[] values = new int[number];

        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;

    }
}
