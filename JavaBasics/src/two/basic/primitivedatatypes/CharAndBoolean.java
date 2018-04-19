package two.basic.primitivedatatypes;

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

	}

}
