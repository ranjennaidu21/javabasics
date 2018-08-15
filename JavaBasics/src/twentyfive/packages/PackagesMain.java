package twentyfive.packages;

public class PackagesMain {

    public static void main(String[] args) {

    	//instead of using import can use fully qualified package name.
    	//for this example let say there are two Node class from different package.
        javafx.scene.Node node = null;
        org.w3c.dom.Node anotherNode = null;
        
        
	    MyWindow myWindow = new MyWindow("Complete Java");
        myWindow.setVisible(true);
    }
}
