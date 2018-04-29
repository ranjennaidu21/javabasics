package twenty.interfaces;

public class Main {

    public static void main(String[] args) {
    	//Interface is methods that particular class in Java must implements the interface
    	//Interface is abstract , No actual code only supply method name, to provide common behavior / standard can be used by several classes
        //Interface is contract that Method signature will not change. It Will not break the code if the we want to change
    	//the parameter in one of the class method which is being used in other classes as well.
    	
    	//In this case the ITelephone is the interface implemented by the DeskPhone and MobilePhone class
    	
    	//We define the variable as a type of ITelephone interface as you need to use the actual class doing the implementation
    	//The interface is just an abstract class to tell what method are valid and to be ovverriden by the actual class
    	ITelephone timsPhone = new DeskPhone(123456);
    	//It is also valid to do as below but later you cannot assign the field to the new Mobile Phone Class object creation below
    	//DeskPhone timsPhone = new DeskPhone(123456);
    	
    	//The below is not valid
    	//ITelephone timsPhone = new ITelephone(123456);
        
    	timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();
        
        //for MobilePhone
        //you can see we can use the timsPhone variable as it is Interface type and both are implementing the same interface
        //so you can create a new MobilePhone class object using that field of Interface type.
        timsPhone = new MobilePhone(24565);
        
        //if you was using DeskPhone timsPhone above like below it wont work
        //DeskPhone timsPhone = new DeskPhone(123456);
        
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
        


    }
}
