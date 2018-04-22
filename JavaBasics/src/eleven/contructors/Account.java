package eleven.contructors;

public class Account {

	    private String number;
	    private double balance;
	    private String customerName;
	    private String customerEmailAddress;
	    private String customerPhoneNumber;

	    public Account() {
	        this("2000", 2.50, "Default name", "Default address", "default phone");
	        System.out.println("Empty constructor called");
	    }

	    public Account(String number, double balance, String customerName, String customerEmailAddress,
	                   String customerPhoneNumber) {
	        System.out.println("Account constructor with parameters called");
	        this.number = number;
	        this.balance = balance;
	        this.customerName = customerName;
	        this.customerEmailAddress = customerEmailAddress;
	        this.customerPhoneNumber = customerPhoneNumber;
	    }

	    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
	        //only the name ,email and number is passed so the rest value need to be hardcoded to set default
	    	//values for that fields and then call the contstructor above which set the value as below.
	    	this("99999",100.55, customerName, customerEmailAddress, customerPhoneNumber);
	    }

	    public void deposit(double depositAmount) {
	        this.balance += depositAmount;
	        System.out.println("Deposit of " + depositAmount + " made.  New balance is " + this.balance);
	    }

	    public void withdrawal(double withdrawalAmount) {
	        if(this.balance - withdrawalAmount <=0) {
	            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
	        } else {
	            this.balance -= withdrawalAmount;
	            System.out.println("Withdrawal of " + withdrawalAmount + " processed.  Remaining balance = " + this.balance);
	        }
	    }

	    public String getNumber() {
	        return number;
	    }

	    public void setNumber(String number) {
	        this.number = number;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void setBalance(double balance) {
	        this.balance = balance;
	    }

	    public String getCustomerName() {
	        return customerName;
	    }

	    public void setCustomerName(String customerName) {
	        this.customerName = customerName;
	    }

	    public String getCustomerEmailAddress() {
	        return customerEmailAddress;
	    }

	    public void setCustomerEmailAddress(String customerEmailAddress) {
	        this.customerEmailAddress = customerEmailAddress;
	    }

	    public String getCustomerPhoneNumber() {
	        return customerPhoneNumber;
	    }

	    public void setCustomerPhoneNumber(String customerPhoneNumber) {
	        this.customerPhoneNumber = customerPhoneNumber;
	    }
	}





