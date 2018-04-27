package seventeen.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

     public static void main(String[] args) {
         boolean quit = false;
         int choice = 0;
         printInstructions();
         while(!quit) {
             System.out.println("Enter your choice: " );
             choice = scanner.nextInt();
             scanner.nextLine();

             switch(choice) {
                 case 0:
                     printInstructions();
                     break;
                 case 1:
                     groceryList.printGroceryList();
                     break;
                 case 2:
                     addItem();
                     break;
                 case 3:
                     modifyItem();
                     break;
                 case 4:
                     removeItem();
                     break;
                 case 5:
                     searchForItem();
                     break;
                 case 6:
                     processArrayList();
                 case 7:
                     quit = true;
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
        System.out.println("\t 6 - To convert the arrayList into array.");
        System.out.println("\t 7 - To quit the application.");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        //for string to enter String put nextLine() for int use nextInt()
        groceryList.addGroceryItem(scanner.nextLine());
    }
   
    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }
   
    //copy ArrayList to another ArrayList
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        //addAll method will get the entire content of the groceryList using the getter method and store it in this newArray Arraylist
        newArray.addAll(groceryList.getGroceryList());
        
        //or another alternate way to copy does the same as addAll as above , it just that we pass as param during initialization
        //ArrayList<String> newArray = new ArrayList<String>(groceryList.getGroceryList());

        //if you want to get the content of the arraylist and convert it back to a regular array
        //declare the array based on the arraylistsize
        String[] myArray = new String[groceryList.getGroceryList().size()];
        //toArray expecting Object[] which we will pass the declaration of array above and store the groceryList arraylist value to the myArray array.
        myArray = groceryList.getGroceryList().toArray(myArray);
		for(int i=0;i<myArray.length;i++){
			System.out.println("Value " + i + " is " +myArray[i]);
		}

    }
}
