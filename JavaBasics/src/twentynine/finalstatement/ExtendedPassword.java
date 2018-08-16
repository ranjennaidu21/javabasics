package twentynine.finalstatement;


public class ExtendedPassword extends Password {
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }
    
    //making the storepassword method as final in superclass will prevent 
    //to override
    //@Override
    //public void storePassword() {
        //System.out.println("Saving password as " + this.decryptedPassword);
    //}
}
