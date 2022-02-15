package com.assignment3;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 2. Write a program to check if a given string is a palindrome or not.
 *	  Palindrome example: trurt
 */

public class Assignment3_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();
		String str_rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str_rev = str_rev + str.charAt(i);
		}
		if (str.equals(str_rev))
			System.out.println("String " + str + " is a Palindrome");
		else
			System.out.println("String" + str + " is not a Palindrome");

	}

}