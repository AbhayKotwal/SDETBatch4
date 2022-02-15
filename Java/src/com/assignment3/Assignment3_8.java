package com.assignment3;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

/*
 * 8. Write a program to re-throw an exception. (throw inside catch block)
 */

public class Assignment3_8 {

	public static void test1() throws Exception 
	{
	      System.out.println("The Exception occured in test1() method");
			throw new Exception("thrown from  the test1() method");
		
	   }
	   public static void test2() throws Exception {
	      try
	      {
	         test1();
	      }
	      catch(Exception e)
	      {
	         System.out.println("Inside the test2() method");
	         throw e;
	      }
	   }
	   public static void main(String[] args)  {
	      try
	      {
	         test2();
	      }
	      catch(Exception e) 
	      {
	         System.out.println("Exception Caught in main method");
	      }
	   }

}