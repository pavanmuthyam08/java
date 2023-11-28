package com.iis.day1;

import java.util.Scanner;
class Circle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float pi=3.14f;
                System.out.println("Enter the Radius of Circle");
                float r=sc.nextFloat();
                float area=pi*r*r;
                float permt=2*pi*r;
                System.out.println("The area of circle is "+area+" And the Perimeter of Circle   is "+permt);
                 
	}
}
