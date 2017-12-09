package linkedlist14;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;



public class Demo {
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
	

	
	
}
