package com.assignment3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 5. Write a program to throw NumberFormatException and handle it appropriately with a proper
 *message.
 *If you pass invalid input to parseInt(str), this exception will be thrown.
 */

public class Assignment3_5 {

	public static void main(String[] args) {

		int number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a Number : ");
		// throws Exception as if the input string is of illegal format for parsing as
		// it as null or alphanumeric.
		try {
		number = Integer.parseInt(scan.next());
		System.out.println("Your number is : " + number);
		}
		catch(NumberFormatException e) {
			System.out.println("Number format exception "+e+" occured. Number should be not be null or alphanumeric");
		}

	}

}