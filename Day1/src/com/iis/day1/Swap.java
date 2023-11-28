package com.iis.day1;

import java.util.Scanner;
class Swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println("enter the another number");
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
                            a=a-b;
		System.out.println("The numbers after Swaping");
		System.out.println(a);
		System.out.println(b);
	}
}