package Testsimple;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {

       Date currentDateAndTime = new Date();
       System.out.println(currentDateAndTime.toString());
       
       SimpleDateFormat sdf = new SimpleDateFormat("MMMM/dd/yyyy");
       System.out.println(sdf.format(currentDateAndTime));

       SimpleDateFormat sd = new SimpleDateFormat("MMMM/d/yyyy hh:mm:ss");
       System.out.println(sd.format(currentDateAndTime));
	}

}
