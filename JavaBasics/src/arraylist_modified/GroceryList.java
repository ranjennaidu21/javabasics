package arraylist_modified;

import java.util.ArrayList;

public class GroceryList {
	//ArrayList is flexible , we will not set capacity of value can assign as in array. It will keep expand as long as u add elements.
	//ArrayList is a class so for now we let the constructor empty
	private static ArrayList<String> groceryList = new ArrayList<String>();
	
	//add groceryItem
	public void addGroceryItem(String name){
		//use the add method to add item into the ArrayList
		groceryList.add(name);
	}
	
	//print all the item in the groceryList
	public void printGroceryItems(){
		//for number of items in ArrayList we will use size , not length
		System.out.println("You have " + groceryList.size() + " number of grocery items.");
		for(int i=0;i<groceryList.size();i++){
			//i+1 to start the printed number from number 1
			//get method get the Array List item value based on the index number that added as argument(i)
			System.out.println((i+1) + "." + groceryList.get(i));
		}
	}
	
	public void modifyGrocItem(String currentItem,String newItem){
		int myposition = searchGroceryItem(currentItem);
		if(myposition>=0){
			modifyGroceryItem(myposition,newItem);
		}
	}
	
	
	//modify groceryItem
	private void modifyGroceryItem(int position,String newItem){
		//the set method will replace the newItem based on the position number in the ArrayList
		//for example if String "haha" is sent via newItem at position 2 , it would be replaced as below
		//1.Milk
		//2.Baby
		//3.Tata //replaced with haha
		groceryList.set(position,newItem);
	}
	
	//modify the removeGroceryItem below where user just need to enter the item name
	//instead of the item position
	//remove groceryItem
	public void removeGrocItem(String name){
		//store the name of the item so that can print out what has been removed
		int myposition= searchGroceryItem(name);
		if(myposition>=0){
			removeGroceryItem(myposition);
		}
	}
	
	//made this private as not able to use this method from the main method
	//and only can use removeGrocItem method above to remove
	private void removeGroceryItem(int position){
		//store the name of the item so that can print out what has been removed
		String item = groceryList.get(position);
		groceryList.remove(position);
	}
	
	
	//return position of the search item
	public int searchGroceryItem(String searchItem){
		return groceryList.indexOf(searchItem);
	}

	//findItem
	public boolean findGroceryItem(String searchItem){
		int position = groceryList.indexOf(searchItem);
		if(position>=0){
			return true;
		}
		return false;
	}
	
	//get method to return the grocery list arraylist with all the values in it
	public static ArrayList<String> getGroceryList(){
		return groceryList;
	}
	
	
	
}
