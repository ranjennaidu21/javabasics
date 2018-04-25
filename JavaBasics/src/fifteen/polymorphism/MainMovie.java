package fifteen.polymorphism;

public class MainMovie {
	//Polymorphism is method/mechanism in OOP that allow action to act differently based on the action being performed
	
	// actually can create the class in separate file but if the code is not
	// that complex you can create it all in one file
	public static void main(String[] args) {
		//return any of the Movie object based on random numbers that return from the randomMovie method
		for(int i=0;i<5;i++){
			Movie movie = randomMovie();
			System.out.println("Movie #" + i + "\n" + "Movie name is:" + movie.getName() + "\n"  
								+ "Movie plot is: " + movie.plot() + "\n");
		}
	}

	// create a static method to get Random Movie
	// method return Movie object
	public static Movie randomMovie() {
		// Math.random will return double so need to cascade to int
		// Math.random from 0 to 1 , to make it 0-3 need to * 3 , to ignore 0
		// need to + 1 after that
		int myRandom = (int) ((Math.random() * 3) + 1);
		System.out.println("Random number generated was: " + myRandom);
		switch (myRandom) {
		case 1:
			return new IndependenceDay();
		// no need break , as it will return value which will break this switch
		// statement. Can put if you want.
		case 2:
			return new Titanic();
		case 3:
			return new Terminator();
		default:
			return null;
		}

	}

}

// create main parent Movie class
class Movie {
	public String name;

	public Movie(String name) {
		this.name = name;
	}

	// plot method , set default value for the parent class
	public String plot() {
		return "No plot";
	}

	// getMethod to get Movie name
	public String getName() {
		return name;
	}

}

// create more 3 more classes that inherit from the parent Movie class
// 1
class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("IndependenceDay");
	}

	// override the plot method from the parent class for this child class
	public String plot() {
		return "Alien come into Earth";
	}
}

// 2
class Titanic extends Movie {
	public Titanic() {
		super("Titanic");
	}

	// override the plot method from the parent class for this child class
	public String plot() {
		return "Ship sink";
	}

}

// 3
class Terminator extends Movie {
	public Terminator() {
		super("Terminator");
	}

	// simply ignore the plot method for this child class to see the difference
	// as it will look for the method name , if don't have , it take the method with
	// same name from the parent class(Movie),

}
