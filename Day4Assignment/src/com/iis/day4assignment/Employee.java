package com.iis.day4assignment;

import java.util.Scanner;

public class Employee {
   long empid;
   String empname;
   String empaddress;
   Long phno;
   double basicsal;
   double sal;
   double specialallowance=250.80;
   double hra=1000.50;
   Scanner sc;
   double tranceall;
   public Employee() {
	   
   }
   
   public Employee(int empid,String empname,String empaddress,Long phno) {
	   sc=new Scanner(System.in);
	  this.empid=empid;
	   this.empname=empname;
	   this.empaddress=empaddress;
	   this.phno=phno;
	  /* System.out.println("enter The Details of Employee");
	   System.out.println("Enter your id");
	  empid= sc.nextInt();
	   System.out.println();
	   System.out.println("Enter a Name of Employee");
	   empname=sc.next();
	   System.out.println("Enter the Address of Employee");
	   empaddress=sc.nextLine();
	   System.out.println("Enter the Phone Number");
	   phno=sc.nextLong();*/
   }
   public void calculateSalary() {
	   System.out.println("Enter Basic Salary");
	   basicsal=sc.nextDouble();
	   System.out.println("Enter special allowances");
	   this.specialallowance=sc.nextDouble();
	   System.out.println("Enter your HRA");
	   this.hra=sc.nextDouble();
	   sal=basicsal+ (basicsal*(specialallowance/100))+(basicsal*(hra/100));
	   
   }
   public void display() {
	   System.out.println("The Employee Id "+empid);
	   System.out.println("The name of Employee is "+empname);
	   System.out.println("The salary is "+sal);
   }
   public void calculateTransportAllowance() {
	   tranceall=0.1*basicsal;
	   System.out.println("The Traveling Allowances is "+tranceall);
   }
 public static void main(String[] args) {
	Employee e=new Employee(101,"pavan","warangal",437634859l);
	e.calculateSalary();
	e.display();
	e.calculateTransportAllowance();
}
}
