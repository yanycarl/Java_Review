package studyJava;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime().toString());
		System.out.println(ca.get(Calendar.YEAR));
		Date da = new Date();
		Date da2 = new Date();
		da2.setDate(19);
		System.out.println(da.before(da2));
		
		DateFormat df = DateFormat.getDateInstance();
		try {
			df.parse("2018-01-26");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(df.getCalendar().get(Calendar.MONTH));
	}
}
