package nine.controlflowstatements;

public class ParseValuesFromString {

	public static void main(String[] args) {
		//throw NumberFormatException if giving different value in the string
	    String IntnumberAsString = "2018";
	    String numberAsString = "2018.125";
	    System.out.println("IntnumberAsString= " + IntnumberAsString);
        System.out.println("numberAsString= " + numberAsString);
        
        //convert string into Integer using wrapper class Integer
        int int_number = Integer.parseInt(IntnumberAsString);
        System.out.println("int_number= " + int_number);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);
        
        //concatinate the string
        numberAsString += 1;
        //give the actual value of the addition
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
	}

}
