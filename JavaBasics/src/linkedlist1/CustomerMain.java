package linkedlist1;

import java.util.ArrayList;

public class CustomerMain {

	public static void main(String[] args) {
		
		//This block is just to show you how memory address work in java
		Customer customer = new Customer("Tim",32.21);
		Customer anotherCustomer;
		//create second class/another instance and set the value of second class to the first object
		//Java actually assign second customer class to point to the first class
		//So it just saved the memory address , it didn't create separate class
		anotherCustomer = customer;
		//set the value for the second class
		anotherCustomer.setBalance(99.99);
		//Try to call the firstclass and you can see the balance value changed as per the second class.
		//Since it saved in memery address and not create separate class,
		//it saved the value in original location , only one class here , the second one point to the first one.
		System.out.println("The value for customer " + customer.getName() + " is: " +  customer.getBalance());
		
		
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(23);
		integerList.add(43);
		integerList.add(53);
		integerList.add(63);
		
		for(int i=0;i<integerList.size();i++){
			System.out.println(i + ": " + integerList.get(i));
		}
		
		//this add element 33 into position 1
		integerList.add(1,33);
		System.out.println("================");
		//lets print again
		for(int i=0;i<integerList.size();i++){
			System.out.println(i + ": " + integerList.get(i));
		}
		
		//This is easy if the you want to add for small list. How if there is large list ?
		//This would take more resources and slow down the process
		//Linked list is an alternative to array
		//Liked list : each element in the list actually holds a link to the item that follows it
		//as well as actual value you want to store as well
		
	}

}
