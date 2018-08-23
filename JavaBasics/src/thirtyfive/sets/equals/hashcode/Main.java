package thirtyfive.sets.equals.hashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Set interface less used compared so lists and maps
//Sets - no defined ordering numbers and cannot contain duplicates
//If do want duplicates better to use Sets than the lists
//no way to retreive an item from the set , can check if it exists and iterate over the elements
//best performing implementation of the Set interface is the HashSet class

public class Main {
	//use map to store all the heavenlybody objects
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    //use set to perform grouping of objects into a different types
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        //storing key value pair into the map
        solarSystem.put(temp.getName(), temp);
        //add the created map object into the sets
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        //create object with sets passed from the object
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Mars", 687);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        //Added Deimos and Phobos  as sets of Mars objects
        
        tempMoon = new HeavenlyBody("Deimos", 1.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        tempMoon = new HeavenlyBody("Phobos", 0.3);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Mars

        temp = new HeavenlyBody("Jupiter", 4332);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        tempMoon = new HeavenlyBody("Io", 1.8);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Europa", 3.5);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Ganymede", 7.1);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter

        tempMoon = new HeavenlyBody("Callisto", 16.7);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon); // temp is still Jupiter
        
        //Added Io , Europa , Ganymede , Callisto as sets of Jupiter objects 

        temp = new HeavenlyBody("Saturn", 10759);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Uranus", 30660);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Neptune", 165);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);
        
        //show all the planets added into the planets HashSets
        System.out.println("Planets");
        for(HeavenlyBody planet : planets) {
            System.out.println("\t" + planet.getName());
        }
        
        //Get the HeavenlyBody mapping object for String Jupiter
        HeavenlyBody body = solarSystem.get("Jupiter");
        System.out.println("Moons of " + body.getName());
        //loop through the sets for that particular HeavenlyBody Jupiter element
        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
            System.out.println("\t" + jupiterMoon.getName());
        }
        
        //Get the HeavenlyBody mapping object for String Mars
        HeavenlyBody body2 = solarSystem.get("Mars");
        System.out.println("Moons of " + body2.getName());
        //loop through the sets for that particular HeavenlyBody Mars element
        for(HeavenlyBody marsMoon: body2.getSatellites()) {
            System.out.println("\t" + marsMoon.getName());
        }
        
        //creating set union using addAll method 
        //retrieve the satelites sets from all the planets objects and insert into
        //the new moons set by loop through each of the elements
        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet : planets) {
            moons.addAll(planet.getSatellites());
        }
        
        //loop through and print each HeavenlyBody element from the moon sets created above.
        System.out.println("All Moons");
        for(HeavenlyBody moon : moons) {
            System.out.println("\t" + moon.getName());
        }
        
        //try to add another object with same name Pluto to the set.
        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);
        
        //you can see pluto is appearing twice eventhough sets eliminate duplicates
        //this is because the two java object do not compare equal so set happy to accept both
        for(HeavenlyBody planet : planets) {
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
        
        //to avoid the problem above the equal and hashcode method should be overwritten in the 
        //HeavenlyBody class
        //this will check if both references poiting to the same object
        //try to comment the equal and hashcode method in HeavenlyBody class . can see differences
        Object o = new Object();
        o.equals(o);
        "pluto".equals("");


    }
}
