package twenty.interfaces;

//it is always recommended to put capital I infront the name of the Interface 
public interface ITelephone {
	//you dont need to put the access modifier public or private for the method below as the actual code will be
	//implemented in the real class that implement this interface
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
