package com.assignment3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 4. Write a program to convert String to a character array and character array to String.
 */

public class Assignment3_4 {

	public static void main(String[] args) {

		String s = "Hello World";

		char[] c = { 'T', 'h', 'i', 's', ' ', 'R', 'a', 'm', 'a', 'k', 'a', 'n', 't', 'h' };

		System.out.println("Given String: " + s);
		char[] ch = s.toCharArray();

		System.out.println("String converted into Character Array: ");

		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}

		System.out.println();
		System.out.println("Character array converted into String: ");
		String str = new String(c);
		System.out.println(str);
	}

}