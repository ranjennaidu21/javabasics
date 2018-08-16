package thirtyone.collections.listmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8, 12);
	    //copy all the seat list from original theatre and store in seatCopy list
	    //this is called shallow copy - referring to same data
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);
        
        //both referring/sharing to same arraylist data. 
        //when you reserve in seatCopy arraylist,
        //it affect the data in theatre arraylist too
        //both diff references but poiting to same object
        seatCopy.get(1).reserve();
        if(theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        //the seatCopy shuffled and we can see the differences , separate arraylist
        //referring to same object
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        //to get first and last element in a sorted list
        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);
        
        //Deep copy , elements not referring to same element
        //Give error as The following only set the capacity of arraylist but
        //containing no elements
        //So it need to have all the elements before copy
        //List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
        //Collections.copy(newList, theatre.seats);
    }


    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================================================================");
    }
    
    //using swap method in Collections to sort the List. This will work as long as the 
    //element implement the Comparable interface
    public static void sortList(List<? extends Theatre.Seat> list) {
        for(int i=0; i<list.size() -1; i++) {
            for(int j=i+1; j<list.size(); j++) {
                if(list.get(i).compareTo(list.get(j)) >0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }













}
