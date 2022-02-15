package com.assignment3;

import java.util.HashMap;

/*
 * 1. Write a program to print the occurrence of each character in the String
“DevLabs Alliance Training”
 */

public class Assignment3_1 {

	public static void main(String[] args) {
		 String str = "DevLabs Alliance Training";
		 
	      HashMap <Character, Integer> hMap = new HashMap<>();
	     // for (int i = str.length() - 1; i >= 0; i--) {
	      for (int i = 0; i <= str.length() - 1; i++) {
	         if (hMap.containsKey(str.charAt(i))) {
	            int count = hMap.get(str.charAt(i));
	            hMap.put(str.charAt(i), ++count);
	         } else {
	            hMap.put(str.charAt(i),1);
	         }
	      }
	      System.out.println("Number of Occurences of Character: " + hMap);

	}

	
}
