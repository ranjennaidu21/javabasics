package core;

public class MethodOverloadingExercise {

	public static void main(String[] args) {
	    // and then here is the tricky part
	    // call the other overloaded method passing the correct feet and inches
	    // calculated so that it can calculate correctly.
	    // hints: Use double for your number datatypes is probably a good idea
	    // 1 inch = 2.54cm  and one foot = 12 inches
	    // use the link I give you to confirm your code is calculating correctly.
		calcFeetAndInchesToCentimeters(13,1);
	    // Calling another overloaded method just requires you to use the
	    // right number of parameters.
		calcFeetAndInchesToCentimeters(2);
		
	}
	
	// Create a method called calcFeetAndInchesToCentimeters
    // It needs to have two parameters.
    // feet is the first parameter, inches is the 2nd parameter
	public static void calcFeetAndInchesToCentimeters(double feet,double inch){ 
		double feetValue = validateFeet(feet);
		double inchValue = validateInch(inch);
	    // If the parameters are valid, then calculate how many centimetres
	    // comprise the feet and inches passed to this method and return
	    // that value.
		if(feetValue!=-1 && inchValue!=-1){
			double ftToCnt = feet * 30.48;
			double inchToCnt = inch * 2.54;
			double ftInch = (ftToCnt + inchToCnt);
			System.out.println(feet + " feet is " + ftToCnt +" cm and " + inch + " inch is "+ inchToCnt + " cm");
			System.out.println(feet + " feet and " + inch + " inch is "+ ftInch + " cm");
		}
	}
    
    // You should validate that the first parameter feet is >= 0
	public static double validateFeet(double feet){
		if(feet>=0){
			return feet;
		}
		System.out.println("Invalid feet in the validateFeet method ");
		return -1;// return -1 from the method if either of the above is not true
	}
	
    // You should validate that the 2nd parameter inches is >=0 and <=12
	
	public static double validateInch(double inch){
		if(inch>=0 && inch<=12){
			return inch;// return -1 from the method if either of the above is not true
		}
		System.out.println("Invalid inch in the validateInch method");
		return -1;
	}
	
	public static double validateInch2(double inch){
		if(inch>=0){
			return inch;// return -1 from the method if either of the above is not true
		}
		System.out.println("Invalid inch in the validateInch2 method");
		return -1;
	}

    

    // Create a 2nd method of the same name but with only one parameter
    // inches is the parameter
    // validate that its >=0
    // return -1 if it is not true
    // But if its valid, then calculate how many feet are in the inches
	
	
	public static void calcFeetAndInchesToCentimeters(double inch){ 
		double inchValue = validateInch2(inch);
	    // If the parameters are valid, then calculate how many centimetres
	    // comprise the feet and inches passed to this method and return
	    // that value.
		if(inchValue!=-1){
			double inchToFt = inch * 0.0833333;
			System.out.println(inch + " inch is "+ inchToFt + " ft");
		}

	}

}
