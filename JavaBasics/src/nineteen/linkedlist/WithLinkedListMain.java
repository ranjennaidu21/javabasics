package nineteen.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class WithLinkedListMain {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        //to add in order must use the addInOrder method and remove the old code commented below.
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        //try to add the element using addInOrder method again and it should fail as it already exist in the list.
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

        //when you do this , you can see Adelaide automatically point to Alice Springs and Alice Springs point to Brisbane in the
        //linked list
        System.out.println("Add Alice Springs");
        placesToVisit.add(1, "Alice Springs");
        printList(placesToVisit);
        //when you do this , you can see Darwin has been removed and Canberra now automatically point to next in the list Melbourne
        //it handles the linking to the next record automatically for you
        //this will help in performance issue
        System.out.println("Remove element in index no 4");
        placesToVisit.remove(4);
        printList(placesToVisit);
        
        //method to move previous and next of the current elements in the Linkedlist
        visit(placesToVisit);
       

    }

    private static void printList(LinkedList<String> linkedList) {
    	//Use iterator , another way to access all the elements in arraylist or linked list
    	//iterator() method is a part of the iterator
        Iterator<String> i= linkedList.iterator();
        //while there is record pointing to another record in linked list. while it is true
        //we will print the current record before move on to next
        while(i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=========================");
    }
    
    //now everytime we add elements into the linked list , we wanted to make sure it is added in an alphabetical order
    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        //ListIterator provide more flexibility than the traditional Iterator Class , like inserting records etc
    	//Regular Iterator cannot go back to the previous record using .previous() as used below
    	ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
        	//.next() return current entry but already moved to next entry
            int comparison = stringListIterator.next().compareTo(newCity);
            //if the current record(next()) is equal to the string value(city to be inserted) we passed it will return 0
            if(comparison == 0) {
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if(comparison > 0) {
                // new City should appear before this one
            	// example if Adelaide is the newCity and Brisbane is the current record,
            	//it will be added before the current Brisbane record
                // Brisbane  -> Adelaide
            	//we already moved to next record using .next() so in order to add it before we need to use .previous()
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if(comparison < 0) {
                // move on next city
            	//in situation we pass Brisbane and Brisbane did not come before Adelaide we do nothing , as we will move to next
            }
        }

        //add the end of the while loop , we will add the city into the linked list as it has been ordered above.
        stringListIterator.add(newCity);
        return true;
    }
    
    //method to move previous and next of the current elements in the Linkedlist
    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        //we need variable to track direction forward or back
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();
        
        if(cities.isEmpty()) {
            System.out.println("No cities in the itenerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;

                case 1:
                    if(!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;

            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }


}
