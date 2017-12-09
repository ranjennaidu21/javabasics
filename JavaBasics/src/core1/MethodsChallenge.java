package core1;

public class MethodsChallenge {

	public static void main(String[] args) {
		int highScorePosition = calculateHighScorePosition(1000);
		displayHighScorePosition("Ranjen", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(700);
		displayHighScorePosition("Tim", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(500);
		displayHighScorePosition("Buchaka", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(300);
		displayHighScorePosition("Naidu", highScorePosition);

		
	}
		
	//  Create a method called displayHighScorePosition
	//  it should a players name as a parameter, and a 2nd parameter as a position in the high score table
	//  You should display the players name along with a message like " managed to get into position " and the
	//  position they got and a further message " on the high score table".
	public static void displayHighScorePosition(String name,int position){
		System.out.println("Player " + name + " managed to get into position " + position + " on the high score table");
	}
	
	//  Create a 2nd method called calculateHighScorePosition
	//  it should be sent one argument only, the player score
	//  it should return an in
	//  the return data should be
	//  1 if the score is >=1000
	//  2 if the score is >=500 and < 1000
	//  3 if the score is >=100 and < 500
	//  4 in all other cases
	//  call both methods and display the results of the following
	//  a score of 1500, 900, 400 and 50
	public static int calculateHighScorePosition(int score){
		if(score >= 1000){
			return 1;
		}else if(score>=500 && score< 1000){
			return 2;
		}else if(score>=100 && score< 500){
			return 3;
		}
		//if not any of the above return 4 , as the method need to return int datatype
		return 4;

	}

}
