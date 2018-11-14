package com.ness.stream;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingResults {

	public static void main(String[] args) {
		
		List<Dog> dogList = Dog.getDoglist();
		
		List<Dog> heavyDogList1 = new ArrayList<>();
		
		// wrong way to collect objects 
		dogList.stream()
				.filter(d -> d.getWeight()>=50)
				.forEach(d -> heavyDogList1.add(d));
		
		
		//correct way to collect obj using Collectors
		List<Dog> heavyDogList2 = dogList.stream()
										 .filter(d -> d.getWeight()>=50)
										 .collect(Collectors.toList());
		
		//find distinct dog breeds 
		Set<String> dogBreeds = dogList.stream()
										.map(Dog::getBreed)  // method ref
										.collect(Collectors.toSet());
		
		//create Map with key --> Dog id and value --> Dog Obj
		Map<Integer, Dog> dogMap = dogList.stream()
										.collect(Collectors.toMap(Dog::getId, dog -> dog));
		
	}
}
