package com.assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/*
 * 3. Check if a particular key exists in HashMap.  
 */

public class Assignment4_3 {

	public static void main(String[] args) {
		
		String key = "Krishna";
		HashMap<String, Integer> hMap = new HashMap<>();
		hMap.put("Krishna", 26);
		hMap.put("Ram", 24);
		hMap.put("Abhilash", 20);
		hMap.put("Dileep", 28);
		System.out.println(hMap);
			if (hMap.containsKey(key)) 
				System.out.println("Does key "+ key + " exists: true");
			else
				System.out.println("Does key "+ key + " exists: false");
	}

}
