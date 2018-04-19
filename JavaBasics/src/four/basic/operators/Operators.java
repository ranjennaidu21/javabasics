package four.basic.operators;

public class Operators {

	public static void main(String[] args) {
		int result = 1 * 2;
		System.out.println("1 * 2 = " + result);
		result += 1;
		System.out.println(result);
		result++;
		System.out.println("result++ : " + result);
		result--;
		System.out.println("result-- : " + result);
		--result;
		System.out.println("--result : " + result);
		++result;
		System.out.println("++result : " + result);
		//give reminder value
		result = result % 3;
		System.out.println("result % 3: " + result);
		
		//assignment operator using '=' to assign value to variable
		int oldNumber = 13;
		int newNumber = 25;
		System.out.println("oldNumber: " + oldNumber);
		System.out.println("newNumber: " + newNumber);
		
		//"==" is used to compare value of primitive datatype
		boolean isTrue = true;
		if(isTrue == true)
			System.out.println("Yes it is true");
		//bydefault boolean value will be assigned to true
		if(isTrue)
			System.out.println("Yes it is abosulutely true");
		
		if(oldNumber != newNumber)
			System.out.println("Both are not equal");
		
		//use bracket to easily readable
		if((oldNumber != newNumber) && (isTrue == true))
			System.out.println("It is true and both are not equal");
		
		//for boolean you can use assignment operator so have to be careful
		boolean isCar = false;
		//this will assign the true value and print the statement which is invalid
		//so must use "==" instead of =
		if(isCar=true){
			System.out.println("It's true yeaaah");
		}
		
		//Boolean shortcut
		//check the isCar variable , store true in myBol if true , vice versa
		boolean myBol = isCar? true:false; 
		System.out.println("myBol value is: " + myBol);
		 
		//test with String
		boolean myBaba = false;
		String name = myBaba? "baba":"tata";
		System.out.println("myBaba value: " + name);

	}

}
