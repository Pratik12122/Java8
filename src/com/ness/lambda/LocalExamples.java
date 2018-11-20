package com.ness.lambda;

import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.ZonedDateTime;
import java.time.format.FormatStyle;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;


public class LocalExamples {
	public static void main(String[] args) {
		// A Locale object represents a specific geographical, political, or
		// cultural region.
		Locale sysLocale = Locale.getDefault();
		System.out.println("Default Locale " + sysLocale); // en_IN

		/*
		 * First comes the lowercase language code.Then comes an underscore
		 * followed by the uppercase country code.
		 */
		
		
		// Properties --> Its like a map 
		Properties props = new Properties();
		
		//we can use maps get method 
		props.setProperty("Hello", "Dummy Prop");
		System.out.println(props.get("Hello"));
		System.out.println(props.getProperty("Hello"));
		//if key not found then return default value
		System.out.println(props.getProperty("Bye", "Bye Dummy"));

		double number = 300.33;
		NumberFormat ukCurrencyformatter = NumberFormat.getCurrencyInstance(Locale.UK);
		NumberFormat usCurrencyformatter = NumberFormat.getCurrencyInstance(Locale.US);

		System.out.println("Currency after UK formatting "  + ukCurrencyformatter.format(number)); 
		System.out.println("Currency after UK formatting "  + usCurrencyformatter.format(number)); 
		
		
		String amt = "$92,807.99";
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		double value = 0.00;
		try {
			value = (Double) cf.parse(amt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(value); // 92807.99
		
		ZonedDateTime zoneDT = ZonedDateTime.now();
	}
}


