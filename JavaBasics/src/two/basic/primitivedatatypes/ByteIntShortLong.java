package two.basic.primitivedatatypes;

public class ByteIntShortLong {

	public static void main(String[] args) {
		// To get Min and Max value
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println("=============================================");
		
		
		//It always recommend to use Integer unless want to save memory use byte
		int myInt = 423;
		//you can put underscore to make readable starting from Java 7
		int myInt2 = 234_290;
		byte myByte = 127; // largest number is 127  , smalles -128 //byte is half size of short
		short myShort = 21232; // short is half size of integer
		long myLong = 5000L + (10L*myByte) + myShort + myInt; // for long need to put Uppercase L(as easy to read) to tell computer it is long value
		System.out.println("myLong: " + myLong);
		
		//Whenever use operator in expression , Java will automatically convert that number into int
		//byte myNewByte = (myByte/2);
		
		//in order to byte accept the value as byte, it need to casted into byteValue , as it automatically convert to integer
		byte myNewByte = (byte)(myByte/2);
		short myNewShort = (short) (100L + (50L * 2));
		System.out.println("myNewByte: " + myNewByte);

	}

}
