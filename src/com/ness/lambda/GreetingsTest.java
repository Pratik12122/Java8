package com.ness.lambda;


//a functional interface has exactly one abstract method.
@FunctionalInterface
interface Greetings {
	String greet(String name);
}

public class GreetingsTest {
	public static void main(String[] args) {

		//java 7 
		Greetings g1 = new Greetings() {
			@Override
			public String greet(String name) {
				return "Hello " + name ;
			}
		};
		testGreeting("Bob", g1);
		
		//java 8 
		Greetings g2 = (name) -> "Ciao " + name;
		testGreeting("Bob", g2);
		
	}
	
	public static void testGreeting(String name, Greetings g) {
		System.out.println(g.greet(name));
	}

	//variable scope
	public static void repeatMessage(String text, int count) {
		//text and count are effectively final
		Runnable r = () -> {
		      for (int i = 0; i < count; i++) {
		    	  //count++;
		         System.out.println(text);
		      }
		   };
		   new Thread(r).start();
	}
	
}

