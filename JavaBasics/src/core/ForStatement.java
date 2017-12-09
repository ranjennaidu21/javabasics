package core;

public class ForStatement {

	public static void main(String[] args) {
		//for is used when you want to loop certain statements a number of times
		for(int i=0;i<5;i++){
			System.out.println("Loop is: " + i);
		}
		
		/*
		System.out.println("===========Exercise========");
		System.out.println("Intrest of 2% for 1000 is: " + calculateInterest(1000.0, 2.0));
		System.out.println("Intrest of 3% for 1000 is: " + calculateInterest(1000.0, 3.0));
		System.out.println("Intrest of 4% for 1000 is: " + calculateInterest(1000.0, 4.0));
		System.out.println("Intrest of 5% for 1000 is: " + calculateInterest(1000.0, 5.0));
        */
		
		// using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.
		for(double i=2;i<=8;i++){
			//System.out.println("Intrest of " + i + "% for 1000 is: " + calculateInterest(1000.0, i));
			//to put in a nice format with 2 decimal places you can use String.format method for statement above as below
			System.out.println("Intrest of " + i + "% for 1000 is: " + String.format("%.2f",calculateInterest(1000.0, i)));
		}
        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%
		//for(init,terminate;increment) 
		System.out.println("====Reverse=====");
		for(double i=8;i>=2;i--){
			System.out.println("Intrest of " + i + "% for 1000 is: " + String.format("%.2f",calculateInterest(1000.0, i)));
		}
		
	    // Create a for statement using any range of numbers
	    // Determine if the number is a prime number using the isPrime method
	    // if it is a prime number, print it out AND increment a count of the
	    // number of prime numbers found
	    // if that count is 3 exit the for loop
	    // hint:  Use the break; statement to exit
		int count = 0;
		for(int i=10;i<50;i++){
			if(isPrime(i)){
				System.out.println(i + " is a Prime number");
				count++;
				if(count==3){
					System.out.println("Exiting for loop");
					break; //break the for loop completely
				}
			}
		}
		System.out.println("Count number is: " + count);
		

	}
	
	public static double calculateInterest(double amount,double interest){
		return (amount *(interest/100));
	}
	
	public static boolean isPrime(int n){
		if(n==1){
			return false;
		}
		
		for(int i=2;i<=(long)Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		
		return true;

	}

}
