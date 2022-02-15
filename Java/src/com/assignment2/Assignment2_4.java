package com.assignment2;

import java.util.Scanner;

/*
 * 4. Find the sum of digits
Example:
int n = 1234;
output: 10
 */
public class Assignment2_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n,i,s=0;
		n=sc.nextInt();
        
        for(;n>0;n=n/10) {
        	s=s+n%10;
        }
        
        System.out.println("Sum of the digits:"+s);
	}

}
