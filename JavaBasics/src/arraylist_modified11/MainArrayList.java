package arraylist_modified11;

import java.util.ArrayList;
import java.util.Scanner;

//same as arraylist package but just did few modification where instead of passing 
//position number we want the gorcerylist class to automatically select and do the
//action for modify and remove item where the user will just send the itemname
public class MainArrayList {
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();

	public static void main(String[] args) {
		boolean quit = false;
		printInstructions();
		while (!quit) {
			System.out.println("Please enter your condition");
			int condition = scanner.nextInt();
			scanner.nextLine(); //add to go execute the next line below
			switch (condition) {
			case 0:
				printInstructions();
				break;
			case 1:
				printItem(); //to be implemented
				break;
			case 2:
				addItem(); //to be implemented
				break;
			case 3:
				modifyItem(); //to be implemented
				break;
			case 4:
				removeItem(); //to be implemented
				break;
			case 5:
				searchItem(); //to be implemented
				break;
			case 6:
				processArrayList(); //to be implemented
				break;
			case 7:
				quit=true;
				break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To print all the item in the copied list.");
		System.out.println("\t 7 - To quit the application.");
	}
	
	public static void printItem(){
		groceryList.printGroceryItems();
	}
	
	public static void addItem(){
		System.out.println("Enter name to add:");
		String itemName = scanner.nextLine();
		groceryList.addGroceryItem(itemName);
	}
	
	public static void modifyItem(){
		System.out.println("Enter current Item name to modify:");
		String currentItem = scanner.nextLine();
		System.out.println("Enter new name to replace the old name above");
		String newItem = scanner.nextLine();
		groceryList.modifyGrocItem(currentItem,newItem); //-1 as we +1 in the list to avoid start numbering from 0
		//System.out.println("Grocery Item " + currentItem + " has been modified to " + newItem);
	}
	
	public static void removeItem(){
		System.out.println("Enter the name of item to remove:");
		String name = scanner.nextLine();
		groceryList.removeGrocItem(name);
	}
	
	public static void searchItem(){
		System.out.println("Enter name of the item to search:");
		String myItem = scanner.nextLine();
		if(groceryList.findGroceryItem(myItem)){
		System.out.println("The " + myItem + " was FOUND in the list");
		}else{
		System.out.println("The " + myItem + " was NOT FOUND in the list");
		}
	}
	
	//copy all the value of arraylist
		public static void processArrayList(){
			ArrayList<String> newArray = new ArrayList<String>();
			newArray.addAll(groceryList.getGroceryList());
			System.out.println("Printing newArray");
			printArrayList(newArray);
			
			//or
			ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
			System.out.println("Printing nextArray");
			printArrayList(nextArray);
			
			//or you can also create a normal array and copy all the values from arraylist into the array
			String[] myArray = new String[groceryList.getGroceryList().size()];
			//toArray convert the ArrayList to array
			//parameter expecting object in array format, return array of strings
			//which matches the declaration above
			//first put the actual variable that we wanted to update to
			//so that myArray will have the content of the array passed from the toArray method
			myArray = groceryList.getGroceryList().toArray(myArray);
			System.out.println("Printing myArray");
			printArray(myArray);
			
		}
		
		//print all the item in the ArrayList that passed
		public static void printArrayList(ArrayList<String> arrayList){
			for(int i=0;i<arrayList.size();i++){
				System.out.println((i+1) + "." + arrayList.get(i));
			}
		}
		
		//print all the item in the Array(not Arraylist) that passed
				public static void printArray(String[] array){
					for(int i=0;i<array.length;i++){
						System.out.println(array[i]);
					}
				}

}
