package com.ness.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> numberList 
			= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//external iteration
		int result  = 0; 
		for (Integer number : numberList) {
			if(number%2 == 0) {
				result += number*2;
			}
		}
		System.out.println("Result1 " + result);
		//iterate --> filter --> multiply the value --> sum
		// internal iteration
		//Intro to Predicate,Function interfaces
		 int result2 = numberList.stream()
				   .filter(new Predicate<Integer>() {
					@Override
					public boolean test(Integer t) {
						return t%2==0;
					}
				})
				.map(new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer t) {
						return t*2;
					}
				}).reduce(0, new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
						return t+u;
					}
				});
		
		System.out.println("Result2 " + result2);
		
		//as Predicate,Function BinaryOperator are functional interface we can use lambda exp
		int result3 = numberList.stream()
				   .filter(t -> t%2==0 )
				   .map(t ->t*2)
				   .reduce(0, (t,u) -> t+u);
		System.out.println("Result3 " + result3);
		
		//using method ref
		int result4 = numberList.stream()
				   .filter(t -> t%2==0 )
				   .map(t ->t*2)
				   .reduce(0, Integer::sum);
		System.out.println("Result4 " + result4);
		
		//using IntStream
		int result5 = numberList.stream()
					  			.filter(t -> t%2==0 )
					  			.map(t ->t*2)
					  			.mapToInt(Integer::intValue)
					  			.sum();
		System.out.println("Result5 " + result5);
	 }
}
