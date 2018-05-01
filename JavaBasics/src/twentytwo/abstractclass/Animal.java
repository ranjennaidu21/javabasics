package twentytwo.abstractclass;

public abstract class Animal {
    private String name;


    public Animal(String name) {
        this.name = name;
    }

    //abstract methods
    public abstract void eat();
    public abstract void breathe();

    //normal methods
    public String getName() {
        return name;
    }
}
