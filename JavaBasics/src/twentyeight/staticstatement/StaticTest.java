package twentyeight.staticstatement;

//static - belongs to class , not class instance
public class StaticTest {
	//static variable - all instance of this class share this one class variable
    private static int numInstances = 0;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }
    
    //we put static here as in the main we use
    // StaticTest.getNumInstances() instead of firstInstance.getNumInstances()
    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
