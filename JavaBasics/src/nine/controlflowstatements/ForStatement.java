package nine.controlflowstatements;

public class ForStatement {

	public static void main(String[] args) {
		//for is used when you want to loop certain statements a number of times
		for(int i=0;i<5;i++){
			if(i==3) {
				System.out.println("This will skip when value is 3 and continue the next sequence of for loop"
						+ "so will not print the value");
				continue;
			}
			System.out.println("Loop is: " + i);
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
					System.out.println("Exiting for loop once the count reach 3");
					break; //break the for loop completely
				}
			}
		}
		System.out.println("Count number is: " + count);
		

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
