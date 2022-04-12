package com.web.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NewDate {
	
	
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scr = new Scanner(System.in);
     String s = null;
     SimpleDateFormat sf = new SimpleDateFormat("dd/mm/yyyy");
     
     
     System.out.println("Enter Date in dd/mm/yyyy formate");
     s = scr.nextLine();
     System.out.println("Enter number of days to be added");
     int days = scr.nextInt();
     
     
		/*
		 * String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
		 * 
		 * //Creating a pattern object Pattern pattern = Pattern.compile(regex);
		 * //Matching the compiled pattern in the String Matcher matcher =
		 * pattern.matcher(s); boolean bool = matcher.matches();
		 */
     
     Date d = null;
 	try {
 		d = sf.parse(s);
 	} catch (ParseException e) {
 		// TODO Auto-generated catch block
 		e.printStackTrace();
 	}
     if(d != null) {
     
BusinessLogic.addDaysToDate(d.getDate(),d.getMonth(), d.getYear(), days);
    	 
     }
     else
    	 System.out.println("In valid formate of date");
	}
	
	
	

}
