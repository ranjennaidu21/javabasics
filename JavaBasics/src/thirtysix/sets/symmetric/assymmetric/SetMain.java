package thirtysix.sets.symmetric.assymmetric;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for(int i=1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
        
        //initialize the sets with squares value
        Set<Integer> union = new HashSet<>(squares);
        //set union of squares and cubes
        union.addAll(cubes);
        System.out.println("Union contains " + union.size() + "  elements.");

        
        Set<Integer> intersection = new HashSet<>(squares);
        //set intersection of cubes and squares
        intersection.retainAll(cubes);
        System.out.println("Intersection contains " + intersection.size() + " elements.");
        for(int i : intersection) {
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year of the fox";
        String[] arrayWords = sentence.split(" ");
        //add all the elements in the collections/list
        words.addAll(Arrays.asList(arrayWords));

        for(String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));

        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));
        
        //showing asymmetric differences
        //assymetric difference as set 1 take 2 , not same as set 2 take 1
        System.out.println("nature - divine:");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("divine - nature:");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);
        
        //SET UNION
        Set<String> unionTest = new HashSet<>(nature);
        unionTest.addAll(divine);
        
        //SET INTERSECTION
        Set<String> intersectionTest = new HashSet<>(nature);
        intersectionTest.retainAll(divine);
        
        //symmetric difference - elements that appear in one set or other 
        //but not both(UNION-INTERSECTION)
        System.out.println("Symmetric difference");
        unionTest.removeAll(intersectionTest);
        //when print all printed except intersection elements (to and is)
        printSet(unionTest);

        
        //containsAll used to test if one set is superset of another
        //just return true or false
        if(nature.containsAll(divine)) {
            System.out.println("divine is a subset of nature");
        }

        if(nature.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of nature");
        }

        if(divine.containsAll(intersectionTest)) {
            System.out.println("intersection is a subset of divine");
        }


    }
    
    private static void printSet(Set<String> set) {
        System.out.print("\t");
        for(String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
