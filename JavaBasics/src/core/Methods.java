package core;

public class Methods {

	public static void main(String[] args) {
		//default value has to be set for the partial call
		//if full call don't have to
		boolean gameOver = true;
		int score = 800;
		int levelCompleted = 5;
		int bonus = 100;
		
		
		//to call the calculate method below
		//partial method call
		//[gameOver,score,5,100] is called arguments
		calculate(gameOver,score,5,100);
		//full method call which will replace the value above 
		calculate(true,10000,8,200);
		
		//to test return method(returnNum) below
		//change the arguments to 3 and other numbers to see difference
		int myTestNum = returnNum(5);
		System.out.println(myTestNum);

	}
	
	//method declaration - to create a method code as below
	//need to make it static method to be called by a static reference (main)
	//[boolean gameOver,int score,int levelCompleted,int bonus] is called parameters
	//void means return nothing from the method
	public static void calculate(boolean gameOver,int score,int levelCompleted,int bonus){
		if(gameOver){
			int finalScore = score + (levelCompleted * bonus);
			System.out.println("Your final score was: " + finalScore);
		}
		
	}
	
	//if wanted to return a value from the method
	public static int returnNum(int number){
		if(number == 3){
			return number;
		}
		//the method have to return int somehow
		return -1;

	}

}
