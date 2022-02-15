package com.assignment2;

import java.util.Scanner;

/*
 * 2. Find all the odd numbers from 79 to 187   
 */
public class Assignment2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("All ODD number from 79 to 187:");
        for(int i=79;i<=187;i++) {
        	if(i%2!=0)
        		System.out.print(i+" ");
        }
	}

}
