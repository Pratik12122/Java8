package com.ness.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
	
public class MethodReferences {

	public static void main(String[] args) {
		List<String> characters = Arrays.asList("Williamson","Tia","Judith","Freeman","Amman","Xyz","tia");
//		for (String name : characters) {
//			System.out.println(name);
//		}
//		
//		characters.forEach(new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t);
//				
//			}
//		});
//		
//		characters.forEach((name) -> System.out.println(name));
//		
//		
		//		• object::instanceMethod
		//
		//characters.forEach(System.out::println);
		

//		• Class::staticMethod
//		
		//characters.forEach(MethodReferences::methodRef);
		

//		• Class::instanceMethod
		Collections.sort(characters, String::compareToIgnoreCase);
		characters.forEach(System.out::println);
	}

	public static void methodRef(String s) {
		System.out.println(s);
	}
}
