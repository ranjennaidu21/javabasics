package twentyeight.staticstatement;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
    	//without putting static for the numInstances , it will give 1 for each of of this
    	//as it will assign same new value to the same variable each time the object instantiate
	    StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest thirdInstance = new StaticTest("3rd instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);

    }
    
    //java cannot allow static method to access non static field.
    //so both field and method should be static as main method is static
    //but we can call static method from non-static method
    public static int multiply(int number) {
        return number * multiplier;
    }
}
