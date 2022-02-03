package com.sahu.spring.springCore.roman;

import java.util.HashMap;
import java.util.Map;

public class romanToIntUsingMap {
	public static final Map<Character, Integer> roman = new HashMap<Character, Integer>();

	public romanToIntUsingMap() {
		super();
		roman.put('I', 1);
		roman.put('V', 5);
		roman.put('X', 10);
		roman.put('L', 50);
		roman.put('C', 100);
		roman.put('D', 500);
		roman.put('M', 1000);
	}

	public static int romanToInt(String s) {
		int sum = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {

			if ( i != n - 1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
				sum += roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i));
				i++;
			} else {
				sum += roman.get(s.charAt(i));
			}

		}
		return sum;
	}

	public static void main(String[] args) {

		romanToIntUsingMap r = new romanToIntUsingMap();
		System.out.println(" map " + r.roman);
		// Considering inputs given are valid
		String input = "MCMIV";

		System.out.print("Integer form of Roman Numeral is " + romanToInt(input));

	}

}
