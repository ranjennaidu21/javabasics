package twentytwo.abstractclass;

//Creating bird as abstract class extend another abstract class
public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");

    }
    //abstract methods
    //this means any class extends this abstract methods must implement eat, breath and fly methods
    public abstract void fly();
}
