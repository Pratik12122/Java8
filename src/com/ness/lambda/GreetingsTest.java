package com.ness.lambda;

@FunctionalInterface
interface Greetings {
	String greet(String name);
}

public class GreetingsTest {
	public static void main(String[] args) {

		Greetings gInJava8 = (name) -> "Hello " + name;
		Greetings gInItalian = (name) -> " Ciao " + name;
		testGreeting("Bob", gInJava8);
		
	}
	
	
	public static void testGreeting(String name, Greetings g) {
		System.out.println(g.greet(name));
	}

	//variable scope
	public static void repeatMessage(String text, int count) {
		   Runnable r = () -> {
		      for (int i = 0; i < count; i++) {
		    	  //count++;
		         System.out.println(text);
		      }
		   };
		   
		   new Thread(r).start();
	}
	

}
