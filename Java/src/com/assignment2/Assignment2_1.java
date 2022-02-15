package com.assignment2;

import java.util.Scanner;

/*
 * 1. Java Program to Calculate average of numbers using Array  
 */
public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of elements in an array:");
		int n,i,s=0;
		n=sc.nextInt();
        int a[] = new int[n];
        for(i=0;i<n;i++) {
        	a[i]=sc.nextInt();	
        }
        
        for(i=0;i<n;i++) {
        	s=s+a[i];	
        }
        System.out.println("Average:"+(double)(s/n));
		 
	}

}
