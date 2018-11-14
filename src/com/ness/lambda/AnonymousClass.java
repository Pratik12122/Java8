package com.ness.lambda;

public class AnonymousClass {
	public static void main(String[] args) {
		//name 
		//args
		//body
		//return type
		
		//before java 8
		Runnable r1 = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello From R1");
			}
		};
		new Thread(r1).start();
		
		//Using lambda Exp
		Runnable r2 = () ->  System.out.println("Hello From R2"); 
		new Thread(r2).start();
	}
}
