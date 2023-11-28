package com.iis.day1;

import java.util.Scanner;
class Product
{
	public static void main(String[] args)
	{
		 System.out.println("Enter the 2 Numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a*b;
		System.out.println("The product of 2 numbers is : "+c);
	}
}
