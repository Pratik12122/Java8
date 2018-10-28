package com.ness.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numberList 
			= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		int result  = 0; 
		for (Integer number : numberList) {
			if(number%2 == 0) {
				result += number*2;
			}
		}
		
		System.out.println(result);
		
		IntStream intStream = numberList
				.stream()
				.filter( t -> t%2==0 )
				.map(t ->  t*2)
				.mapToInt(Integer::intValue);
	    
	    System.out.println(intStream.sum());
	    System.out.println(intStream.sum());
		
	}
}
