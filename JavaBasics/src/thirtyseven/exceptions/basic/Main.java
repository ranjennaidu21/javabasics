package thirtyseven.exceptions.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x, y));
        
        //give ArithmeticException exception
        //System.out.println(divide(x, y));
        
        //catch the ArithmeticException exception that raised when divide by zero
        System.out.println(divideEAFP(x, y));
        
        //both method divideEAFP and divideLBYL is better
        
        //now try to create method to make sure the value entered is valid
        //you can use any of this two methods but getIntEAFP() is recommended
        int z1 = getIntLBYL();
        System.out.println("z1 is " + z1);
        
        int z2 = getIntEAFP();
        System.out.println("z2 is " + z2);
    }

    private static int getInt() {
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private static int getIntLBYL() {
    	//for example if you put different value other than integer will get 
    	//InputMissMatchException , so we add condition to return zero if the 
    	//value is not valid
        Scanner s = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("getIntLBYL: Please enter an integer ");
        String input = s.next();
        for(int i=0; i<input.length(); i++) {
        	//check if the value is digit
            if(!Character.isDigit(input.charAt(i))) {
                isValid = false;
                break;
            }
        }
        if(isValid) {
            return Integer.parseInt(input);
        }
        return 0;
    }
    
    //capturing the InputMismatchException
    private static int getIntEAFP() {
        Scanner s = new Scanner(System.in);
        System.out.println("getIntEAFP: Please enter an integer ");
        try {
            return s.nextInt();
        } catch(InputMismatchException e) {
            return 0;
        }
    }

    private static int divideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }
    
    
    private static int divideEAFP(int x, int y) {
        try {
            return x / y;
        } catch(ArithmeticException e) {
            return 0;
        }
    }

    private static int divide(int x, int y) {
        return x / y;
    }
}
