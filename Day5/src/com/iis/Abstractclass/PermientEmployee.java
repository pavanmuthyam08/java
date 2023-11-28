package com.iis.Abstractclass;

public class PermientEmployee extends Employee
{
   private double sal;
   @Override
   public void accept() {
	   super.accept();
	   System.out.println("Enter the Salary of Employee");
	   sal=sc.nextDouble();
	   
   }
   @Override
   public void display() {
	   super.display();
	   System.out.println("Tha Salary of Empoyee is "+sal);
   }
@Override
public void calculateSal() {
	sal=sal*12;
	System.out.println("The Annual Salary is "+sal);
	
}
   
}
