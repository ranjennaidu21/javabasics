package core1;

public class KeyWordsAndExpressions {

	public static void main(String[] args) {
		//Keywords - you cannot use keyword as variable name
		//int int = 45; //This will shown as invalid VariableDeclarationId
		//but you can use the following by change the variable name instead
		int int2 = 2;
		
		//Expressions is anything within a statement except the data type and semicolon
		//Statement = Expression + datatype + semicolon
		
		//For the example below : Mentioned in the comment above which is expression
		//myDoub = 23.0
		double myDoub = 23.0; 
		//myDoub == 23 and "Same" 
		// System.out.println is not as it is considered as System method
		//if , bracket and semicolon is not expression
		if(myDoub == 23){
			System.out.println("Same");
			myDoub = 0; //myDoub = 0
		}

	}

}
