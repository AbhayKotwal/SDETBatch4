package com.assignment2;

import java.util.Scanner;

/*
 * 3. Is 13 a prime number?   
 */
public class Assignment2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=3,flag=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0){      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }      
        }
		 
		if(flag==0)  { System.out.println(n+" is prime number"); }
	}
}
