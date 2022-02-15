package com.assignment1;

/*
 * 4. Write a program to check whether the current year is leap year or not. Users will
enter a year value. 
 */


//Leap year --> exactly divisible by 4 except for century years.
//if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))

// Check for Non-century yr - ((year % 4 == 0) && (year % 100!= 0))
// Check for Century yr 	- (year%400 == 0)

// 2016 - leap year
// 2000 - leap year(Century) 
// 2100 - Non-leap year(Century)

/************
 *if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
 *
 *
 *if ((year % 100!= 0)){				// determines yr is century yr or not
 *	 if((year % 4 == 0)) prime 			// determines that non - century yr is prime
 *}
 *else if((year % 400 == 0)) prime		// determines that century yr is prime
 *
 *else Not prime						// determines that century or non - century yr is not prime
 * */


public class Assignment1_4 {

	public void leapyear(int year) {
			if ((year % 100!= 0))
			 {if((year % 4 == 0))
				 System.out.println("Non - Century year is prime");
			 }
			 else if((year % 400 == 0)) 
				 System.out.println("Century year is prime");
			 
			 else System.out.println("Century year/Non-century year is not prime");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Assignment1_4 obj = new Assignment1_4();
		obj.leapyear(2100);

	}

}
