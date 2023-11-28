package com.iis.day1;

import java.util.Scanner;
class Cal
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 numbers");
		int a=sc.nextInt();
  		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Enter a Phone Number");
		long phonenumber=sc.nextLong();
		System.out.println("sum is : " +sum);
		System.out.println("phonenumber is : "+phonenumber);
	}
} 