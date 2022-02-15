package com.assignment3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 6. Write a program where a method declares that it throws ArithmeticException.
 */

public class Assignment3_6 {
	
	public static void divisionOperation(int a, int b) {
		try{
			System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception: cannot divide by 0");
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Please enter a & b value : ");
		int a,b;
		a=Integer.parseInt(s.next());
		b=Integer.parseInt(s.next());
		Assignment3_6.divisionOperation(a, b);
		

	}

}