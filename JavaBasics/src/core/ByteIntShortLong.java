package core;

public class ByteIntShortLong {

	public static void main(String[] args) {
		// To get Min and Max value
		/*
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		*/
		
		//It always recommend to use Integer unless want to save memory use byte
		int myInt = 423;
		byte myByte = 121;
		short myShort = 21232;
		long myLong = 5000L + (10L*myByte) + myShort + myInt;
		System.out.println(myLong);
		
		//Whenever use operator in expression , Java will automatically convert that number into int
		//byte myNewByte = (myByte/2);
		
		//in order to byte accept the int value , it need to casted into byteValue
		byte myNewByte = (byte)(myByte/2);
		short myNewShort = (short) (100L + (50L * 2));
		System.out.println(myNewByte);

	}

}
