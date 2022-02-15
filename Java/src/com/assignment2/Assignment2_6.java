package com.assignment2;

/*
 * 6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6
 */

public class Assignment2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12, 32, 12, 45, 65, 93, 0, 23, 45, 6};							
		
		System.out.println(arr.length);
        for (int i = 0; i < arr.length-1; i++)	  //read arr.length-1 elements				
        {							
            for (int j = i+1; j < arr.length; j++)//read j=i+1 element							
            {							
                if ((arr[i] == arr[j]) && (i != j))							
                {							
                    System.out.println("Duplicate Element : "+arr[j]);							
                }							
            }							
        }

	}
}
