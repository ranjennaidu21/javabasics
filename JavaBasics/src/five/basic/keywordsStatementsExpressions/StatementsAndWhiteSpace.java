package five.basic.keywordsStatementsExpressions;

public class StatementsAndWhiteSpace {

	public static void main(String[] args) {
		//Java will ignore the white space and go to next line in a statement
		//Whitespace is usually used to separate the data type and value , or to make the code readable

		//The following are not recommended but just to show that this is valid statement as well
		
		
		// you can put the continuation of the statement in new line
		int myNum 
		=
		3;
		
		if(myNum
				==3){
			System.out.println(
					"Yes "
					+ "this is valid");
		}
		
		//you can put all the statement in one line
		String name = "Haha";System.out.println("This is " + name);

	}

}
