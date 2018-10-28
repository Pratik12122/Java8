package com.ness.stream;

import java.util.ArrayList;
import java.util.List;

public class Dog {
	Integer id;
	String name;
	String color;
	String breed;
	int weight;

	public Dog(int id, String name, String color, String breed, int weight) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.breed = breed;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	

	
	static List<Dog> getDoglist() {
		List<Dog> resultList = new ArrayList<>();
		resultList.add(new Dog(1,"Max", "White", "Beagle", 10));
		resultList.add(new Dog(2,"Cooper", "Dark Brown", "BullDog", 20));
		resultList.add(new Dog(3,"Rocky", "Cream", "BullDog", 50));
		resultList.add(new Dog(5,"Sophie", "White", "Labrador", 10));
		resultList.add(new Dog(4,"Lucy", "Dark Brown", "pug", 15));
		return resultList;
	}


	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", color=" + color + ", breed=" + breed + ", weight=" + weight
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
