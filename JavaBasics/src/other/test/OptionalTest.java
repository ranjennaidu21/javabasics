package other.test;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		
		//To create an empty Optional object:
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());
		//A value is present if and only if we have created Optional with a non-null value
	    String name = "baeldung";
	    System.out.println(Optional.of(name));
	    
	    //The value is available to process
	    Optional<String> optString = Optional.of(name);
	    System.out.println(optString);
	    
	    Optional<Long> optLong = Optional.of(0l);
	    //to reassign value
	    optLong = Optional.of(3l);
	    System.out.println(optLong);
	    
	    Optional<Integer> optInteger = Optional.of(356);
	    System.out.println(optInteger);
	    
		//Returning Value with get()
	    System.out.println(optString.get());
	    System.out.println(optLong.get());
	    System.out.println(optInteger.get());
	    
	    if(optLong.get() == 3) {
	    	System.out.println("Yes it is 3 ");
	    }else {
	    	System.out.println("No it is not 3");
	    }
	    
	    //However, the argument passed to the of method cannot be null, otherwise, we will get a NullPointerException:
/*	    String name2 = null;
	    Optional<String> opt2 = Optional.of(name2);
	    System.out.println(opt2.toString());*/
	    
	    

	    
	    
	}

    
}
