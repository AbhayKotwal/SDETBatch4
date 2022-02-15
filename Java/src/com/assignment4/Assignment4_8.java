package com.assignment4;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * 8. Get Set view of keys from HashTable.   
 */

public class Assignment4_8 {

	public static void main(String[] args) {

		Hashtable ht = new Hashtable();
	      ht.put("Fruit", "Apple");
	      ht.put("Vegetable", "Onions");
	      ht.put("Flower", "Rose");
	      Enumeration e = ht.keys();
	      
	      while (e.hasMoreElements()) {
	         System.out.println(e.nextElement());
	      }
	}

}
