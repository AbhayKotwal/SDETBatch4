package com.assignment1;

/*
 * 5. Write a program to print the first 10 prime numbers.
 */

public class Assignment1_5 {

	public void printPrime()
	{	int c=0,flag=0;
			for(int j=2;c<10;j++)
			{
				for(int i=2;i<=j/2;i++)
				{
					if(j%i==0)
					{            
						flag=1;
						//System.out.println(j+" is not prime");
						break; 
					}
				}
				if(flag==0) {
					System.out.println(j+" is prime");
					c=c+1;
				}
				else flag=0;
			}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1_5 obj = new Assignment1_5();
		obj.printPrime();
		
	}

}
