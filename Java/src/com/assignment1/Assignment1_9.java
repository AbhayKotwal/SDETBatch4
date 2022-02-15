package com.assignment1;

/*
 * 9. Write a program to print only even numbers till 50. 
 */

public class Assignment1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 50;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
