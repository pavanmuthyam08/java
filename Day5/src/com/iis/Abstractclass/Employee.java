package com.iis.Abstractclass;
import java.util.*;
public abstract class Employee {
	private int empid;
     private String empname;
     protected Scanner sc;
     public Employee() {
    	 sc=new Scanner(System.in);
     }
     public void accept() {
    	 System.out.println("Enter the Employee Id");
    	 empid=sc.nextInt();
    	 System.out.println("Enter the Employee Name");
    	 empname=sc.next();
    	 
     }
     public void display() {
    	 System.out.println("The Employee Id is"+empid);
    	 System.out.println("The Employee Name is"+empname);
     }
     public abstract void calculateSal();
}
