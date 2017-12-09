package inheritence;

//super class
public class Animal {

		//Inheritance is there is common state and behavior of the super class that can be inherited by other class(subclass)
		
		private int brain;
		private int size;
		private int weight;
		private String category;
		
		//Create constructor to initialize variables
		public Animal(String category,int brain, int size, int weight) {
			this.category=category;
			this.brain = brain;
			this.size = size;
			this.weight = weight;
		}
		
		
		public String getCategory() {
			return category;
		}


		public int getBrain() {
			return brain;
		}


		public int getSize() {
			return size;
		}

		public int getWeight() {
			return weight;
		}

		public void move(){
			System.out.println("Animal move() called");
		}
		
		public void eat(){
			System.out.println("Animal eat() called");
		}



}
