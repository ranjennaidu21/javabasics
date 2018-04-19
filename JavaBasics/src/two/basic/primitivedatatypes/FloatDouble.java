package two.basic.primitivedatatypes;

public class FloatDouble {

	public static void main(String[] args) {
		//Float and double are similar but double are: more precise , faster , used by most of the inbuilt functions(sin,cos,tan,etc)
		int myInt = 5;
		//if you just put the decimal number , java will assume it as double by default. So you need to cast it to float
		float myFloat = (float)5.4;
		float myFloat2 = 2f; //put f to represent float. Not wrong if didn't put , but just not recommended.
		double myDouble = 2d; //put d to represent double.
		
		//you can see double is more precise , faster in modern computer , mostly used in java inbuilt functions
		//8 bytes
		float myFloat3 = myInt/3f;
		//16 bytes
		double myDouble2 = myInt/3d;
		System.out.println("Compare float and double<double is more precise>: ");
		
		System.out.println("myFloat3" + myFloat3);
		System.out.println("myDouble2" + myDouble2);

	}

}
