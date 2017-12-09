package core1;

public class WhileAndDoWhile {

	public static void main(String[] args) {
		//while is used when not sure number of loops and want to loop till certain condition is true
		//while will be executed as long as the condition specified is true
		int count = 0;
		while(count<5){
			System.out.println("Count is: " + count);
			count++;
		}
		
		System.out.println("============While with break=================");
		
		//set the count to 0 again to test the below example
		count = 0;
		//the loop will be continue as long as it is true
		while(true){
			//to break when the count reach 3
			if(count==3){
				break;
			}
			System.out.println("Count value is: " + count);
			count++;
		}
		
		System.out.println("=============Do While================");
		
		//set the count to 0 again to test the below example
		count = 0;
		//dowhile is similar to while but the code will be executed atleast once
		do{
			if(count==2){
				break;
			}
			System.out.println("Count for this is: " + count);
			count++;
		}while(count<4);
		

		//call the method to check the even method using while loop
		System.out.println("===Calling IsEven Method===");
		int number= 5;
		int finishNumber =11;
		while(number<= finishNumber){
			//make sure it is odd number so that the next time it increment will be even number
			if(!isEvenNumber(number)){
				number++;
				//the continue is opposite of break, it will not interrupt the whole while block code ,
				//this will skip the code below and continue with the while loop by testing the new value(number++) above
				continue; 
			}
			System.out.println("Even number: " + number);
			number++;	
		}
		
		
		
		System.out.println("===Modification of IsEven Method - Calculate total even numbers=====");
        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found
		number= 5;
		finishNumber =20;
		count = 0;
		while(number<= finishNumber){
			//make sure it is odd number so that the next time it increment will be even number
			if(!isEvenNumber(number)){
				number++;
				//the continue is opposite of break, it will not interrupt the whole while block code ,
				//this will skip the code below and continue with the while loop by testing the new value(number++) above
				continue; 
			}
			System.out.println("Even number: " + number);
			count++;
			number++;
			if(count==5){
				break;
			}
		}
		System.out.println("Total even numbers: " +count);

		
		
	}
	
    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;
	public static boolean isEvenNumber(int number){
		int value = (number%2);
		if(value!=0){
			return false;
		}
		return true;

	}

}
