package seventeen.arraylist;

import java.util.ArrayList;

public class GroceryList {
	 //List is an interface and it extends Collection interface
	 //ArrayList inherited from AbstractList which implements List interface 
	 //Arraylist handle resizing of array automatically.
	
	//create variable to access ArrayList
	//for ArrayList it hold object so need to tell what type of data need to go inside the ArrayList, for this String
	//the bracket is added auto as ArrayList is a class
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	//getter method to retrieve the groceryList
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
    	//to add items into the arraylist
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        //size return how many elements inside the arraylist
        for(int i=0; i< groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //to replace or modify the existing item in list by passing position to replaced 
    //and new item name
    //made the function to private as to force user 
    //to only access and use the modifyGroceryItem() method below
    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    
    //overloading method to replace or modify the existing item in list 
    //by passing current item name to be replaced and new item name
    //can include the function above inside this function
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        //get will return the element based on the index no which is position in this case
        //the indexOf return -1 if the list does not contain the elements , so:
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }
 
    //to remove the existing item in list by passing index of the element
    //made the function to private as to force user to 
    //only access and use the removeGroceryItem() method below
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    
    //overloading the method above , to remove the existing item by passing the itemname
    //instead of position number as above. will call that function inside this function
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }
    
    //to search the existing item in list
    //made the function to private as to force user to 
    //only access and use the onFile() method below
    private int findItem(String searchItem) {
      //there is existing function to return true if it found 
      //and false if not found in the list , using contains as below
      //boolean exists = groceryList.contains(searchItem);
    	
      //will use indexOf just try to create our own implementation for that 
      //without using the top one 
      //indexOf will return the index position of the item if found in the list
      //the indexOf return -1 if the list does not contain the elements
      return groceryList.indexOf(searchItem);
  }
    
    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >=0) {
            return true;
        }

        return false;
    }
    
    
}
