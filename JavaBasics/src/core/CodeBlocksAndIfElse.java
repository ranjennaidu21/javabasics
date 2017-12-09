package core;

public class CodeBlocksAndIfElse {

	public static void main(String[] args) {
		boolean isPro = true;
		if(isPro)
			System.out.println("Yes you are pro");
			System.out.println("New line");
		
		// if use if statement without code block, it will take the first statement
		// after it for the if statement and will not check the next following lines
		boolean isWeak = false;
		if(isWeak==false)
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
		
		System.out.println("=====================================");
		System.out.println("Exercise");
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was: " + finalScore);
		}
		
		
		//print out a second score on the screen with the following
		//score set to 1000
		//levelCompleted set to 8
		//bonus set to 200
		// But make sure the first printout above still displays as well
		
		//You cannot use an existing variable above as it will replace the variable value completely
		//If you use , then you need to store the initial value of the variable above into another variable
		/*	
		 	boolean newValue = true;
			if(newValue){
				score = 1000;
				levelCompleted = 8;
				bonus = 200;
				int newFinalScore = score + (levelCompleted * bonus);
				System.out.println("Your final score was: " + newFinalScore);
			}
			// for this the value will be 1000 even outside the if code block as the variable value is changed
			System.out.println(score);
		*/
		
		boolean newGameOver = true;
		int newScore = 10000;
		int newLevelCompleted = 8;
		int newBonus = 200;
		
			if(newGameOver){
				int newFinalScore = newScore + (newLevelCompleted * newBonus);
				System.out.println("Your final score was: " + newFinalScore);
			}

	}

}
