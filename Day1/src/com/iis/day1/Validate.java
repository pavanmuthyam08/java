package com.iis.day1;

import java.util.Scanner;
public class Validate
{
	public static void main(String [] args)
	{
		int age;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age");
		age=sc.nextInt();
		if(age>18&&age<60)
		{
			System.out.println("Valid age");
		}
		else
		{
			System.out.println("Invalid age");
		}
	}
}