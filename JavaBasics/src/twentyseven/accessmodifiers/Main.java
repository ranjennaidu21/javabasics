package twentyseven.accessmodifiers;

public class Main {
	
/*	public - visible to all classes everywhere wherether same package
	or have imported package containing public class
	package private - object visible to every class within same package but
	not to classes in external packages, default when do not specify public/no access modifier, no keyword as "package-private"
	private - object visible within the class it declared, not visible anywhere
	even subclass of its class
	protected - object visible to every class within same package but also in
	subclasses even if there are from another package
	*/

    public static void main(String[] args) {
	    Account timsAccount = new Account("Tim");
        timsAccount.deposit(1000);
        timsAccount.withdraw(500);
        timsAccount.withdraw(-200);
        timsAccount.deposit(-20);
        timsAccount.calculateBalance();
        
        //can change the balance amount directly if the access is public instead of private
        //so need to avoid that and use private
        //timsAccount.balance = 5000;

        System.out.println("Balance on account is " + timsAccount.getBalance());
        //same goes to transaction arraylist cannot be public as can set directly from here
        //should be private
        //timsAccount.transactions.add(4500);
        timsAccount.calculateBalance();
    }
}
