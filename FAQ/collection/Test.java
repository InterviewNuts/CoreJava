package com.sahu.spring.springCore.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> word = new ArrayList<String>(3);
		word.add("Hara");
		word.add("Mohan");
		System.out.println(word.size());
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(11);

		ll.add(14);
		ll.add(15);
		ll.add(12);
		ll.add(13);
		for (int i : ll)
			System.out.println(i);
		System.out.println("----------------------");
		ll.sort(null);
		for (int i = 0; i < ll.size(); i++)
			System.out.println(ll.get(i));

		ArrayList<Vehicle> v = new ArrayList<Vehicle>();
		System.out.println("Vector Size = " + v.size());

		v.add(new Vehicle(1999, "Honda"));
		v.add(new Vehicle(1989, "Hyndai"));
		v.add(new Vehicle(2000, "Tata Motors"));

		List<Vehicle> list = Collections.synchronizedList(v);

		System.out.println(list);

		System.out.println("----------------------");

		HashSet<Vehicle> set = new HashSet<Vehicle>();
		Vehicle v1 = new Vehicle(1999, "Honda");
		Vehicle v2 = new Vehicle(1890, "Hyundai");
		Vehicle v3 = new Vehicle(1999, "Honda");
		Vehicle v4 = new Vehicle(2009, "Tata Motors");

		set.add(v1);
		set.add(v2);
		set.add(v3);
		set.add(v4);

//		for (Vehicle s : set) {
//			System.out.println(s);
//		}
//
//		if (v1.equals(v3))
//			System.out.println("TRUE");
//		else
//			System.out.println(v1.equals(v3));

		System.out.println(v1.hashCode());
		System.out.println(v3.hashCode());
	}

}
