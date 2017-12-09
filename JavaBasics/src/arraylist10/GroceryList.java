package arraylist10;

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
	
	//modify groceryItem
	public void modifyGroceryItem(int position,String newItem){
		//the set method will replace the newItem based on the position number in the ArrayList
		//for example if String "haha" is sent via newItem at position 2 , it would be replaced as below
		//1.Milk
		//2.Baby
		//3.Tata //replaced with haha
		groceryList.set(position,newItem);
		System.out.println("Grocery Item position " + (position+1) + " has been modified");
	}
	
	//remove groceryItem
	public void removeGroceryItem(int position){
		//store the name of the item so that can print out what has been removed
		String item = groceryList.get(position);
		groceryList.remove(position);
		System.out.println(item + " has been removed from the groceryList");
	}
	
	//findItem
	public String findGroceryItem(String searchItem){
		// you can use inbuilt contains method which will return true if it found the searchItem String value in the groceryList
		//boolean exists = groceryList.contains(searchItem);
		
		//but we just try a manual method to compare the value using indexOf method as below
		//this method will return index position of the String(searchItem) passed on 
		//if the position found it will return the position else will return -1
		int position = groceryList.indexOf(searchItem);
		//We need to return the List Name if the position is found.
		if(position>=0){
			return groceryList.get(position);
		}
		//return null if the position is not found
		return null;
	}
}
