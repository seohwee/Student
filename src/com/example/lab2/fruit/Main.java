package com.example.lab2.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Fruit> fl=new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name)");
		Fruit s1=new Fruit(101, "Apple", 1000);
		fl.add(s1);
		Fruit s2=new Fruit(102, "Orange", 1500);
		fl.add(s2);
		fl.add(new Fruit(103, "Kiwi", 2000));
		
		Collections.sort(fl, new FruitComparator());
		for(Fruit s : fl) {
			System.out.println(s.toString());
		}
		System.out.println("Fruit List (reverse ordered by name)");
		Collections.sort(fl, new FruitComparatorDesc());
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}
	}
}
