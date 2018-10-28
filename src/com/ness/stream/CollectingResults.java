package com.ness.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import static java.util.stream.Collectors.*;

public class CollectingResults {

	public static void main(String[] args) {
		List<Dog> dogList = Dog.getDoglist();
		List<Dog> heavyDogList = new ArrayList<>();
		// wrong way
		dogList.stream()
				.filter(d -> d.getWeight()>=50)
				.forEach(d -> heavyDogList.add(d));

		//Grouping
		Map<String, List<Dog>> breedMap 
				= dogList.stream()
						.collect(groupingBy(d -> d.getBreed()));
		
		System.out.println(breedMap);
				
				
				
						
	}
	
}
