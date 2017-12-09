package core1;

public class SwitchStatement {

	public static void main(String[] args) {
		// switch is used if there is many value for ONE VARIABLE.
		// if you want to check multiple variables it is recommended to use if
		// statement.
		int switchValue = 3;
		switch (switchValue) {
		case 1:
			System.out.println("Value is 1");
			break; // must put break if not will print other statement below
					// till it found break statement

		case 2:
			System.out.println("Value is 2");
			break;

		// can put multiple value like this
		case 3:
		case 4:
		case 5:
			System.out.println("Value is 3 or 4 or 5");
			break;

		default:
			System.out.println("Not any of the value above");
			break; // will work even if you didn't put break at default here as
					// it going to break the switch statement anyway
		}

		System.out.println("===========Exercise============");
		// Create a new switch statement using char instead of int
		char switchChar = 'F';
		// create a new char variable
		// create a switch statement testing for
		// A, B, C, D, or E
		switch (switchChar) {
		// display a message if any of these are found and then break
		// Add a default which displays a message saying not found
		case 'A':
			System.out.println("It is A");
			break;
		
		case 'B':
			System.out.println("It is B");
			break;
			
		case 'C':
			System.out.println("It is C");
			break;
			
		case 'D':
			System.out.println("It is D");
			break;
			
		case 'E':
			System.out.println("It is E");
			break;
			
		default:
			System.out.println("Not Found");
			break;
		}
		
		//from java 6 onwards can use string for switch statement
		String month = "JAN";
		//use toLowerCase method of String class to convert to lowercase
		switch(month.toLowerCase()){
		case "jan":
			System.out.println("January");
			break;
		default:
			System.out.println("Not January");
		}

	}

}
