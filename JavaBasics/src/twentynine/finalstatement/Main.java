package twentynine.finalstatement;

public class Main {
	
	//we can assign a final value when first declared or in constructor
	//use when the value is constant and wont change , stored only once at class level

    public static void main(String[] args) {
	    SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());
        
        //so the instanceNumber cannot be changed once the class instance has been created

        //we cannot assign a value to the final variable
//        one.instanceNumber = 4;
        
        //if you check , the PI declared using public static final
        System.out.println(Math.PI);


        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        //when set the right password show Welcome
        password.letMeIn(674312);
    }
}
