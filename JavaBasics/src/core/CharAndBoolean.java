package core;

public class CharAndBoolean {

	public static void main(String[] args) {
		// char is used to display any symbol / single character which is 2 byte
		char myChar1 = 'a';
		char myChar2 = '#';
		System.out.println("myChar1: " + myChar1);
		System.out.println("myChar2: " + myChar2);

		// char also used to display Unicode character. Reference:
		// http://unicode-table.com/en/
		char uniCode = '\u00A9';
		System.out.println("Unicode output: " + uniCode);

		// boolean value is used to check true or false which will be discussed
		// in conditional statement later
		boolean isMale = true;

		// Exercise
		// 1. Find the code for registered symbol
		// 00A0E
		// 2. Create a variable of type char and assign it to unicode value of
		// that symbol
		char uniCode2 = '\u00AE';
		// 3. Display it on screen
		System.out.println("Unicode for Register: " + uniCode2);

	}

}
