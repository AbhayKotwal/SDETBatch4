package com.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 1. Find duplicate characters with their occurrences count using HashMap. 
 */

public class Assignment4_1 {

	public static void main(String[] args) {
		String str = "DevLabs Alliance Training";

		HashMap<Character, Integer> hMap = new HashMap<>();
		// for (int i = str.length() - 1; i >= 0; i--) {
		for (int i = 0; i <= str.length() - 1; i++) {
			if (hMap.containsKey(str.charAt(i))) {
				int count = hMap.get(str.charAt(i));
				hMap.put(str.charAt(i), ++count);
			} else {
				hMap.put(str.charAt(i), 1);
			}
		}
		Map<Character, Integer> collect = hMap.entrySet().stream().filter(s -> s.getValue() > 1)
				.collect(Collectors.toMap(s -> s.getKey(), s -> s.getValue()));

		/*
		 * hMap.entrySet() .stream().filter(s -> s.getValue() > 1) .forEach(s ->
		 * System.out.println(s.getKey()+"-"+s.getValue())); // forEach(input ->
		 * System.out.println(input.getKey() + " : " + // input.getValue()));
		 */
		System.out.println("Number of Occurences of Character: " + hMap);
		System.out.println("Duplicate characters with their occurrences count: " + collect);

	}

}
