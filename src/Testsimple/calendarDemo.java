package Testsimple;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM/dd/yyyy");
	       System.out.println(sdf.format(cal.getTime()));
	       System.out.println(cal.get(Calendar.HOUR_OF_DAY));
	       System.out.println(cal.get(Calendar.MINUTE));
	       System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	       System.out.println(cal.get(Calendar.AM_PM));
	}

}
