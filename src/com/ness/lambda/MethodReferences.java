package com.ness.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
	
public class MethodReferences {

	//		• object::instanceMethod
	// 		• Class::staticMethod
	//		• Class::instanceMethod

	public static void main(String[] args) {
		List<String> characters 
			= Arrays.asList("Williamson","Tia","Judith","Freeman","Amman","Xyz","tia");
		
		// lambda exp withot method ref
		characters.forEach(s -> System.out.println(s));
		
		// using method ref
		characters.forEach(System.out::println);
		
		//calling class static method by 
		characters.forEach(MethodReferences::makeStringToUpperCase);
		
		//sorting string using sort method into in java8
		characters.sort((s1,s2) -> s1.compareToIgnoreCase(s2));
		characters.forEach(System.out::println);
		
		//sorting using method ref
		characters.sort(String::compareToIgnoreCase);
		
	}

	public static void makeStringToUpperCase(String s) {
		System.out.println(s);
	}
	
}
