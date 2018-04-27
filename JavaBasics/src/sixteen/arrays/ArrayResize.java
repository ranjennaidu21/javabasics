package sixteen.arrays;

import java.util.Scanner;

public class ArrayResize {
	
	//this is just to show how to resize array. but to be more productive for more number of elements
	//we will use list and arraylist
    private static Scanner s = new Scanner(System.in);
    private static int[] baseData = new int[10];

    public static void main(String[] args) {
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        //after resize we can put the additional two elements in the array.
        baseData[10] = 67;
        baseData[11] = 34;
        printArray(baseData);

    }

    private static void getInput()
    {
        for(int i = 0; i < baseData.length; i++)
            baseData[i] = s.nextInt();
    }

    private static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    private static void resizeArray()
    {
        //get the actual baseData array with 10 and copy/store it to the new original array(backup).
    	int[] original = baseData;
    	
    	//the declare the array with new size , store each of the value for this array from the backup 
    	//which is original array we copied above
        baseData = new int[12];
        for (int i = 0; i < original.length; i++)
            baseData[i] = original[i];
    }

}
