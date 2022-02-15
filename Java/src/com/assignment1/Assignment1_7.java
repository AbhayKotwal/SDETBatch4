package com.assignment1;

/*
 * 7. Write a program to print the sum of the first 20 natural numbers. 
 */

public class Assignment1_7 {

	public double printSum(long n) {
		return n*(n+1)*(0.5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_7 obj = new Assignment1_7();
		System.out.println(obj.printSum(20));
	}
}
