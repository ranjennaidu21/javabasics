package nineteen.linkedlist;

import java.util.ArrayList;

public class WithoutLinkedListMain {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        //the second Customer class point to the first class , it just save the memory address not create another Class
        anotherCustomer = customer;
        //so it save the value in just one class , so when run the query below will return 12.8 as anotherCustomer is pointing
        //to the same Customer class in the memory address
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }
        
        //the following add number 2 in index position 1
        intList.add(1, 2);

        for(int i=0; i<intList.size(); i++) {
            System.out.println(i +": " + intList.get(i));
        }
        
        //in real case let say they is alot of records in the list
        //if you add or delete the element 2 above. it require a lot of time and memory space
        //to fill up the space by moving other records up to fill the gap in the space.

        //So here is where we will use the linked list where
        //Linked list : Alternative to array where it store the actual link to the next item in the list as actual data.
        //Another word is each element in the list holds a link to the item that follows it as well as the actual item
    }
}
