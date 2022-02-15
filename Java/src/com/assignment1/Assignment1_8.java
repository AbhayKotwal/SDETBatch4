package com.assignment1;

import java.util.Scanner;

/*
 * 8. Write a program to reverse the elements of an array where the array size as well as the
array values are entered by the user.
 */

public class Assignment1_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[10]; // declaration
		int temp = 0;
		int n = 0;

		Scanner s = new Scanner(System.in);
		System.out.println("How many elements you want to enter: ");
		n = s.nextInt();

		System.out.println("Enter the elements of the array");

		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}

		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = i + 1; j < arr.length;
		 * j++) { if (arr[i] < arr[j]) { temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
		 * } }
		 * 
		 * }
		 */
		System.out.println("Array in reverse order:");
		for (int i = n - 1; i >= 0; i--) {

			System.out.print(arr[i]+" ");
		}

	}

}
