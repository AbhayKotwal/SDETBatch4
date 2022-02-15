package com.assignment2;

import java.util.Scanner;

/* 
 *5. Reverse a number 123 
 */
public class Assignment2_5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n,r=0;
		n=sc.nextInt();

        while(n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n =n/ 10;
        }

        System.out.println("Reversed Number: " + r);
	}

}
