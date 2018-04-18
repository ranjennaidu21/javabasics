package other.test;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class SqlTimeStampConverter {
	public static void main(String[] args) throws ParseException {
		java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("1994-03-22 24:15:13.05");
		System.out.println("java.sql.Timestamp: " + timestamp);
		
		//convert the sql timestamp to Java Date Util
		Date date = new Date(timestamp.getTime());
		System.out.println("java.util.Date: " + date);
		
		//change timezone of the date 
		DateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss z");
		formatter.setTimeZone(TimeZone.getTimeZone("CET"));
		//for more list can check https://en.wikipedia.org/wiki/List_of_time_zone_abbreviations
		  
		// Prints the date in the CET timezone
		System.out.println("In CET Timezone: " + formatter.format(date));
		  
		// Set the formatter to use a different timezone
		formatter.setTimeZone(TimeZone.getTimeZone("MYT"));
		  
		// Prints the date in the IST timezone
		System.out.println("In MYT Timezone: " + formatter.format(date));
		
		// Convert java Date back to sql Date
		java.util.Date utilDate = date;
		Calendar cal = Calendar.getInstance();
		cal.setTime(utilDate);
		cal.set(Calendar.MILLISECOND, 0);
		System.out.println("Util Date to Sql Timestamp: " + new java.sql.Timestamp(utilDate.getTime()));
		//you can cut off the milliseconds using a Calendar
		System.out.println("Util Date to Sql Timestamp: " + new java.sql.Timestamp(cal.getTimeInMillis()));
	}	 
	

}
