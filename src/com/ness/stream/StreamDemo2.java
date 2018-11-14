package com.ness.stream;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamDemo2 {

	public static void main(String[] args) {
			//iterate
			Stream.iterate(0, e -> e+1);
			// generate 
			
			//distinct
			Stream<String> uniqueWords
			   = Stream.of("merrily", "merrily", "merrily", "gently");
	
	}
}
