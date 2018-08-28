package thirtynine.inputoutput.filewriter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//locations class that implement the map interface
public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new HashMap<Integer, Location>();
    
    //FileWriter to write to a text file
    public static void main(String[] args) throws IOException {
        //using try with resources start from java 7 easier way to avoid messy code below
    	//as no point to just catching the exception unless you do something about it
    	//now exception is being thrown/specify rather than catch as below
    	//now this try with resources ensure the file is closed regardless of code execute
    	//normally or exception occurs
        try(FileWriter locFile = new FileWriter("locations.txt")) {
            for(Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
            }
        }
        
               
        //we put this before the try block so that it will be available in the 
    	//catch and finally block
        
/*    	FileWriter locFile = null;

        try {
        	//gives a file name
        	//you can see this is written to the folder outside of src path
        	//eg:C:\Users\ranje\git\javabasics\JavaBasics
            locFile = new FileWriter("locations.txt");
            for(Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
            }
            //IOException is a checked exception where we cannot ignore it and need
            //to deal with it otherwise the program wont compile
        } catch(IOException e) {
            System.out.println("In catch block");
            e.printStackTrace();
        } finally {
        	//cleanup code must be executed for this no matter what
        	//finally : the code in this block will be executed no matter what
        	//can be try and catch or try and finally as  minimum
            System.out.println("in finally block");
            try {
                if(locFile != null) {
                    System.out.println("Attempting to close locfile");
                    //if output file is not closed 
                    //data can be corrupted or file remain lock
                    locFile.close();
                }
            } catch(IOException e) {
                e.printStackTrace();
            }
        }
*/
    }
    
    //store static data for the location map above
    //this static block will be executed once when the locations class is loaded
    static {
        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 1);
        tempExit.put("W", 2);
        locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in the forest",tempExit));

    }
    
    //add all the map interface code that must be implemented
    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();

    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
