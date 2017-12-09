package arraylist;

import java.util.Scanner;

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
		System.out.println("\t 6 - To quit the application.");
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
		System.out.println("Enter position to modify:");
		int pos = scanner.nextInt();
		scanner.nextLine();//add to go execute the next line below
		System.out.println("Enter name to replace the value in the position" + pos + ":");
		String item = scanner.nextLine();
		groceryList.modifyGroceryItem((pos-1), item); //-1 as we +1 in the list to avoid start numbering from 0
	}
	
	public static void removeItem(){
		System.out.println("Enter position of the value to remove:");
		int posi = scanner.nextInt();
		groceryList.removeGroceryItem(posi-1);
	}
	
	public static void searchItem(){
		System.out.println("Enter name of the item to search:");
		String myItem = scanner.nextLine();
		if(groceryList.findGroceryItem(myItem) != null){
		System.out.println("The " + myItem + " was FOUND in the list");
		}else{
		System.out.println("The " + myItem + " was NOT FOUND in the list");
		}
	}

}
