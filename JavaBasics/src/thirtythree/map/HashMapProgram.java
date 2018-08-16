package thirtythree.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapProgram {
	
	//Map is not part of Collection exactly, there are hashmap , linked hashmap , treemap 
	//which implement sorted map interface
    public static void main(String[] args) {
    	//key and value both are String for this case
        Map<String, String> languages = new HashMap<>();
        
        //check if the key already exist
        if(languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }
        


        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code"));
        //if first time added when we check below it will return null
        System.out.println(languages.put("Lisp", "Therein lies madness"));
        //if the key already exist and we are putting for the second time , it will print the
        //previous value stored instead of null
        System.out.println(languages.put("Lisp", "Second time updated Therein lies madness"));
        
        languages.put("Algol", "second time updated value");
        //print the value based on the key
        //the key is unique value , if you try and use the value again , the new value 
        //will be overwritten
        System.out.println("Get Algol value: " + languages.get("Algol"));
        
        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
        }

        System.out.println("================================================");
       
      //remove the Lisp key and value from the map
      languages.remove("Java");
      
      //if want to remove by checking both key and value
      //try change to correct value and see below , it will be removed
      if(languages.remove("Algol", "an algorithmic language")) {
          System.out.println("Algol removed");
      } else {
          System.out.println("Algol not removed, key/value pair not found");
      }
      
      //to replace value for existing key
      if(languages.replace("Lisp", "Second time updated Therein lies madness", "a functional programming language with imperative features")) {
          System.out.println("Lisp replaced");
      } else {
          System.out.println("Lisp was not replaced");
      }
      
      //System.out.println(languages.replace("Scala", "this will not be added"));
      
        //to loop through the map and return all the value, 
        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
