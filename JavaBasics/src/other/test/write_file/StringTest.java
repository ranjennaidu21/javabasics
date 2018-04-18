package other.test.write_file;

import com.sun.xml.internal.ws.util.StringUtils;

public class StringTest {

	public static void main(String[] args) {
		String string1 = "320212223451";
		String string2 = "620212223451";
		String nullString = null;
		String emptyString = "";
		
/*		if(string1.startsWith("3")){
			System.out.println("Yes "+ string1 + " starts with 3");
		}else{
			System.out.println("No "+ string1 + " not starts with 3");
		}
		
		if(string2.startsWith("3")){
			System.out.println("Yes "+ string2 + " starts with 3");
		}else{
			System.out.println("No "+ string2 + " not starts with 3");
		}*/
		
/*		if(StringUtils.isEmpty(emptyString)){
			System.out.println("is empty");
		}
		
		if(StringUtils.isEmpty(nullString)){
			System.out.println("is null");
		}*/
		
		String test1 = nullString + string2;
		String test2 = nullString + emptyString;
		System.out.println("test1" + test1);
		System.out.println("test2" + test2);
		
	}

}
