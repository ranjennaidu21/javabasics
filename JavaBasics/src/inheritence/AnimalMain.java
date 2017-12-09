package inheritence;

public class AnimalMain {

	public static void main(String[] args) {
		//Test with object from Animal class
		Animal animal = new Animal("Big", 3, 2, 1);
		System.out.println("Animal Category:" + animal.getCategory());
		System.out.println("Animal Brain: " + animal.getBrain());
		System.out.println("Animal Size: " + animal.getSize());
		System.out.println("Animal Weight: " + animal.getWeight());

		
		System.out.println();
		//Test with object from Dog class which inherited from Animal class
		Dog dog = new Dog("haha",8,3,5,"Bobby");
		System.out.println("Dog Brain: " + dog.getCategory());
		System.out.println("Dog Brain: " + dog.getBrain());
		System.out.println("Dog Size: " + dog.getSize());
		System.out.println("Dog Weight: " + dog.getWeight());
		System.out.println("Dog Name: " + dog.getName());
		
		System.out.println();
		//call specific method only to Dog and not able to access from the super class Animal
		//animal.chew();
		dog.chew();
		System.out.println();
		//you can call method declared in superclass using the subclass object as below
		dog.eat();
		//Overriding: you can call method declared in superclass but specific to subclass as below:
		dog.move();
		
		
	}

}
