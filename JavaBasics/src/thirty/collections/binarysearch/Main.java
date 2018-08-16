package thirty.collections.binarysearch;

public class Main {
	//List,Sets>SortedSet,Queue are part of Collection , extend the Collection interface
	//Main Component / Core elements of Collection framework is Interface, 
	//Interface are abstract type that represent collections
	
	//Binary search using Comparable Interface is faster that normal default checking

    public static void main(String[] args) {
    	//name,number of rows,seats  per row
	    Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        
        //second time should give error, as the seat already reserved
        if(theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
        

        if(theatre.reserveSeat("B13")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
