package fortyone.inputoutput.bufferedreaderwriter;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {
    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {
        
    	
    	//better way using BufferedWriter
        try(BufferedWriter locFile = new BufferedWriter(new FileWriter("locations.txt"));
                BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))) {
                for(Location location : locations.values()) {
                    locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                    for(String direction : location.getExits().keySet()) {
                        //skip and avoid writing for Quit 
                    	if(!direction.equalsIgnoreCase("Q")) {
                            dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                        }
                    }
                }
            }
    	
    	//old way using FileWriter only
/*    	
 		try(FileWriter locFile = new FileWriter("locations.txt");
            FileWriter dirFile = new FileWriter("directions.txt")) {
            for(Location location : locations.values()) {
                locFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for(String direction : location.getExits().keySet()) {
                    dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                }
            }
        }
*/
    }

    static {


        //new way using BufferedReader
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("locations.txt")))) {
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
        //old way using FileReader only
/*      
 		Scanner scanner = null;  
 		try {
            scanner = new Scanner(new FileReader("locations.txt"));
            scanner.useDelimiter(",");
            while(scanner.hasNextLine()) {
                int loc = scanner.nextInt();
                scanner.skip(scanner.delimiter());
                String description = scanner.nextLine();
                System.out.println("Imported loc: " + loc + ": " + description);
                Map<String, Integer> tempExit = new HashMap<>();
                locations.put(loc, new Location(loc, description, tempExit));
            }

        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
*/

        // Now read the exits using BufferedReader.
        //BufferedReader faster and better approach - read text from input stream and buffer the characters
        //into a character array
        try (BufferedReader dirFile = new BufferedReader(new FileReader("directions.txt"))) {
            String input;
            while((input = dirFile.readLine()) != null) {
                //int loc = scanner.nextInt();
                //scanner.skip(scanner.delimiter());
                //String direction = scanner.next();
                //scanner.skip(scanner.delimiter());
                //String dest = scanner.nextLine();
                //int destination = Integer.parseInt(dest);
                
            	
            	//easier way to use string array split approach than above.
            	//get string array with each from the line seperated with coma
                String[] data = input.split(",");
                //get based on the string array element index
                int loc = Integer.parseInt(data[0]);
                String direction = data[1];
                int destination = Integer.parseInt(data[2]);
                

                System.out.println(loc + ": " + direction + ": " + destination);
                Location location = locations.get(loc);
                location.addExit(direction, destination);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
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
