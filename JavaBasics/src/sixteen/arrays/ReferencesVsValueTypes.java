package sixteen.arrays;

import java.util.Arrays;

public class ReferencesVsValueTypes {

	public static void main(String[] args) {
		
		//all primitive types are value types - hold values
		//array and string is reference type
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("anotherIntValue = " + anotherIntValue);
        
        //for primitive type above single space in memory is allocated to store the value
        //and variable directly hold the value.
        
        //a reference hold a reference to the address to the object , not the object itself
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        //myIntArray and anotherArrayis a two references pointing to the same array
        //in the memory or same address

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));
        //both changed as referring to the same array in the memory
        
        //now anotherArray is new references with poiting to new array
        anotherArray = new int[]{4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));

	}
	
    private static void modifyArray(int[] array) {
    	//changing the first element of array to 2, for myIntArray this case
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
        //creating new array , we cannot see the changes when run the code
        //as anotherArray and myIntArray is still referring to the different address above.
    }

}
