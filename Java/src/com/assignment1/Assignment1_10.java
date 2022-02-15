package com.assignment1;

import java.util.Scanner;

/*
 * 10. Write a program to print this output using a two-dimensional array.
Triangle Array --> Pascal’s Triangle
   		 0
  		0 0
 	   0 0 0
      0 0 0 0
     0 0 0 0 0
    0 0 0 0 0 0
   0 0 0 0 0 0 0
  0 0 0 0 0 0 0 0
 0 0 0 0 0 0 0 0 0
0 0 0 0 0 0 0 0 0 0
 */
public class Assignment1_10 {

	public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int n,i,j,s;
		String a[][] = new String[10][10];
	        System.out.println("HOW MANY STEPS?");
	        n=sc.nextInt();
	        s=n-1; 

	        for(i=0;i<n;i++){
	            for(j=0;j<=i;j++)
	                a[i][j]="*";
	        }
	        
	        System.out.println("\nOUTPUT:\n");
	        for(i=0;i<n;i++)
	        {
	            for(j=0;j<=s;j++)
	            System.out.print(" ");
	            s--;
	            
	            for(j=0;j<=i;j++)
	                System.out.print(a[i][j]+" ");

	            System.out.println();
	        }
	}

}