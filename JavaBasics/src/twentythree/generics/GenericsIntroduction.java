package twentythree.generics;

import java.util.ArrayList;

public class GenericsIntroduction {

    public static void main(String[] args) {
    	//we need to specifically tell Java the object type inside the arraylist
    	//raw types is not recommended
    	
    	//for anything before java 8 use as below
    	//ArrayList<Integer> items = new ArrayList<Integer>();
        
    	ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tim");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
    	//now instead of Object i : n , we can specifically put integer as it datatype 
    	//for each element in the list
        for(int i : n) {
            System.out.println( i * 2);
        }
    }
}
