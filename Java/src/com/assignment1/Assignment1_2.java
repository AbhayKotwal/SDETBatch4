package com.assignment1;

/*
 * 2. Write a program to print fibonacci series (10 values).
A series where the next term is the sum of previous two terms. The first
two terms of the Fibonacci sequence is 0 followed by 1.
The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ... 
 */

public class Assignment1_2 {

	public int fib(int n) {
		if (n==1) {
			return 0;
		}
		else if(n==2)	return 1;
		
		else return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_2 obj = new Assignment1_2();
		for(int i=1;i<=10;i++)
		System.out.println(obj.fib(i));
	}

}
