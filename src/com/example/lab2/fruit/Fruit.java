package com.example.lab2.fruit;

import comc.example.lab2.Student;

class FruitComparator implements Comparator<Fruit>{
	int no;
	String name;
	int price;
	
	public int compare(Fruit o1, Fruit o2) {
		return o1.name.compareTo(o2.name);
	}
}


class FruitComparatorDesc implements Comparator<Fruit>{
	public int compare(Fruit o1, Fruit o2) {
		return o2.name.compareTo(o1.name);
	}
}
