package com.iis.variables;

import java.util.Scanner;

public class Employee {
	 Scanner sc;
	private int empid;
	private String name;
	public Employee() {
		sc=new Scanner(System.in);
	
	}
	public void accept() {
		System.out.println("Enter The details of Employee");
		System.out.println("Enter the Employee Id");
		empid=sc.nextInt();
		System.out.println("Enter the Employee name");
		name=sc.next();
	}
	
	public void display() {
	System.out.println("the Employee Id is "+empid);
	System.out.println("The Name of Employee is "+name);
	
	}

}
