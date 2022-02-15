package com.assignment3;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 3. Write a program to check “brown” is present in the string: A brown fox ran away fast
 */

public class Assignment3_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		if (str.contains("brown")) System.out.println("brown is present in the given string: "+str);
		else System.out.println("brown is not present in the string "+str);
	}

}