package linkedlist2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
//This is same as Demo.java, but it just that we added an extra method call visit 
//which gives you option of specifying whether you want to go forward or back 
//when you actually searching

public class DemoImproved {

public static void main(String[] args) {
		
		LinkedList<String> placestoVisit = new LinkedList<String>();
		placestoVisit.add("Arab");
		placestoVisit.add("Belgium");
		placestoVisit.add("Germany");
		placestoVisit.add("Malaysia");
		placestoVisit.add("Singapore");
		placestoVisit.add("Zimbabwe");
		
		//create method to print the list above
		printList(placestoVisit);
		
		//add element to the list above according to position
		placestoVisit.add(3,"Lololo");
		printList(placestoVisit);
		
		//remove element from the list above based on position
		placestoVisit.remove("Zimbabwe");
		//or position number
		placestoVisit.remove(2);
		printList(placestoVisit);
		
		System.out.println("Now try to add elements in alphabetical order\n"
				+ "into the LinkedList "
				+ "using the addInOrder method");
		addInOrder(placestoVisit, "India");
		addInOrder(placestoVisit, "Argentina");
		addInOrder(placestoVisit, "Nepal");
		//try to add an already included element to see it print the warning message
		//as mentioned in the addInOrder method below for duplication records
		addInOrder(placestoVisit, "Arab");
		printList(placestoVisit);
		
		//this is the added visit method
		visit(placestoVisit);
		
	}
	
	public static void printList(LinkedList<String> linkedList){
		//we can use Iterator class to print each of the element in array,arraylist and linkedlist
		Iterator<String> i = linkedList.iterator();
		//while there is element in the list (hasNext)
		while(i.hasNext()){
			//it will print the current one(i) , and move to the next entry(next).print current value before move on
			System.out.println("Now visiting: " + i.next());
		}
		System.out.println("===========================");
	}
	
	
	//now every time we add an element , we wanted to make sure it is added in alphabetical order
	public static boolean addInOrder(LinkedList<String> linkedList,String newCity){
		//ListIterator is special type iterator where you can go to the previous element in the list
		ListIterator<String> stringListIterator = linkedList.listIterator();
		//while there is element in the list (hasNext)
		while(stringListIterator.hasNext()){
			//compare the value with the string passed on , if equal return 0 , if not 1
			int condition = stringListIterator.next().compareTo(newCity);
			if(condition ==0){
				//no need to add
				System.out.println(newCity + " is already included as destination");
				return false;
			}else if (condition>0){
				//add if both of it not same
				//now we already at the next entry , so for current entry we need to go the previous entry and move cursor position 
				//backwards to add
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			}else if (condition<0){
				//move to next element city
				//no need to put anything here as stringListIterator.next() will already go to next element
			}
		}
		//we have go through the entire list without find any suitable point for the entry,
		//so the new item should go to the end of the list anyway
		stringListIterator.add(newCity);
		return true;
		
	}
	
	//add a method call visit which gives you option of specifying whether you want to 
	//go forward or back when you actually searching.
	private static void visit(LinkedList cities){
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		//adding boolean goingForward as if you click previous for case 2 , it show the current object
		//again and then we need to click previous again to go to previous element. this is because
		//how it work for listiterator .. so to fix that we need to add condition using this boolean
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		
		//check if linked list is empty then return, if not print the first element
		if(cities.isEmpty()){
			System.out.println("No cities in the itenary");
			return;
		}else{
			System.out.println("Now visiting : " + listIterator.next());
			//printMenu is the function that will be call to display all the menu
			printMenu();
		}
		
		//continue with the while loop
		while(!quit){
			int action = scanner.nextInt();
			//just to clear the input line after that
			scanner.nextLine();
			switch(action){
			case 0 :
				System.out.println("Holiday Vacation Over!");
				quit=true;
				break;
			//while there is next element in the list print that	
			case 1: 
				//in case the user have previously selected to go back
				if(!goingForward){
					//make sure we can go next and can go next again so that we can continue from where we left of.
					if(listIterator.hasNext()){
						listIterator.next();
					}
					goingForward = true;
				}
				if(listIterator.hasNext()){
					System.out.println("Now visiting:" + listIterator.next());
				}else{
					System.out.println("You have reached end of the list");
					//put goingForward to false as we already reached end of the list
					goingForward=false;
				}
				break;
			//while there is previous element in the list print that
			case 2: 
				//it is going backward the it is goingForward currently
				if(goingForward){
					if(listIterator.hasPrevious()){
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()){
					System.out.println("Now visiting:" + listIterator.previous());
				}else{
					System.out.println("We are at start of the list");
					//set goingForward to true as it is the only direction that we can go
					goingForward = true;
				}
				break;	
			//to print the menu
			case 3:
				printMenu();
				break;	
			}//end of switch
		}//end of while
			
	}//end of visit method
	
	private static void printMenu(){
		System.out.println("Available actions:\npress:");
		System.out.println("0 - to quit\n"
				+ "1- go to next city\n"
				+ "2- go to previous city\n"
				+ "3- print menu options");
	}
	
}



