package com.assignment4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

/*
 * 7. Sort ArrayList of Strings alphabetically.   
 */

public class Assignment4_7 {

	public static void main(String[] args) {

		   ArrayList<String> aList = new ArrayList<String>();					
		   aList.add("India");					
		   aList.add("Canada");					
		   aList.add("Singapore");					
		   aList.add("SouthAfrica");					
		   					
		   System.out.println("********Before Sorting:");					
		   for(String counter: aList){					
				System.out.println(counter);			
			}				
							
		   				
		   Collections.sort(aList);					
	       System.out.println("********After Sorting:");					
		   for(String counter: aList){					
				System.out.println(counter);			
			}
	}

}
