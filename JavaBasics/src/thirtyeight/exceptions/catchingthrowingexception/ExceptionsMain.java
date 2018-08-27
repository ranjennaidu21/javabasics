package thirtyeight.exceptions.catchingthrowingexception;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ExceptionsMain {
	
	//now we can use multi catch exception 
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
            //from java 8 two or more exceptions can be catched as below
        } catch(ArithmeticException | NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down");
        }
    }

    private static int divide() {
        int x, y;
        //now we can comment all the catch exception in this method as all exceptions below
        //will be catched in the main method above
        
        //throw exception when enter invalid characters like string , char etc
        //try {
            x = getInt();
            y = getInt();
        //} catch(NoSuchElementException e) {
            //throw new ArithmeticException("no suitable input");
        //}
        System.out.println("x is " + x + ", y is " + y);
      //throw exception when divide by zero
        //try {
            return x / y;
        //} catch(ArithmeticException e) {
            //throw new ArithmeticException("attempt to divide by zero");
        //}
    }
    
    //another easier way is to do multicatch once for above
/*    private static int divide() {
        int x, y;
        try {
        x = getInt();
        y = getInt();
        System.out.println("x is " + x + ", y is " + y);
        return x / y;
        //so only the exception that catched will be executed and any remaining
        //catch block after the first catch will be ignored
        } catch(NoSuchElementException e) {
            throw new ArithmeticException("no suitable input");
        } catch(ArithmeticException e) {
            throw new ArithmeticException("attempt to divide by zero");
        }
    }*/
    
    //can throw the exception in the calling method
    private static int getInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter an integer ");
        //continue to execute till we break it
        while(true) {
            //catch the inputmismatchexception and ask to retype
        	//if type other values than integer, example string or characters
        	try {
                return s.nextInt();
            } catch(InputMismatchException e) {
                // go round again.  Read past the end of line in the input first
                s.nextLine();
                System.out.println("Please enter a number using only the digits 0 to 9 ");
            }
        }
    }
}
