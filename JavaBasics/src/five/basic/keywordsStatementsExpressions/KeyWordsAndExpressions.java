package five.basic.keywordsStatementsExpressions;

public class KeyWordsAndExpressions {

	public static void main(String[] args) {
		//Keywords - you cannot use keyword as variable name
		//int int = 45; //This will shown as invalid VariableDeclarationId
		//but you can use the following by change the variable name instead
		int int2 = 2;
		
		//Expressions is anything within a statement except the data type and semicolon
		//Statement = Expression + datatype + semicolon
		
		//below is an expression
		double myDoub = 23.0; 
		// System.out.println is not as it is considered as System method
		//if , bracket and semicolon is not expression
		if(myDoub == 23){ //myDoub == 23 is expression
			System.out.println("Same"); //"Same" is expression
			myDoub = 0; //myDoub = 0 is expression
		}

	}

}
