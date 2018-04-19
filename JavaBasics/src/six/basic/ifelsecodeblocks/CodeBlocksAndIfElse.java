package six.basic.ifelsecodeblocks;

public class CodeBlocksAndIfElse {

	public static void main(String[] args) {
		boolean isPro = true;
		if(isPro)
			System.out.println("Yes you are pro");
			System.out.println("New line");
		
		// if use if statement without code block, it will take the first statement only
		// and will not check the next following lines
		boolean isWeak = false;
		if(isWeak==true)
			System.out.println("Yes you are weak");
			System.out.println("This new line still be printed as seperate statement");
			
			
			
		/*		
		 * if declare new variable inside code block , 
		 * it only can used within the code block and will no longer usable 
		 * once out of the block code 
		*/
		int myNum = 3;
		if(myNum==3){
			//you can use variable(myNum) declared outside of the code block 
			int myNewNum = 3 + myNum;
			System.out.println("myNewNum: " + myNewNum);
		}
		//but you cannot use the variable declared inside the block(myNewNum) outside of it
		//System.out.println(myNewNum);
		
		int score = 400;
		if(score<500 && score>100) {
			System.out.println("Score between 200-500");
		}else if(score>0) { //eventhough this is true it will only take the first condition it get true
			System.out.println("More than 0");
		}else {
			System.out.println("None of above");
		}
		
	}

}
