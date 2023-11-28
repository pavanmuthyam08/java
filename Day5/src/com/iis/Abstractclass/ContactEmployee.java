package com.iis.Abstractclass;

public class ContactEmployee extends Employee
{
   private double contSal;
   private double contbond;
   @Override
   public void accept() {
	  super.accept();
	  System.out.println("Enter the Salary of ContactEmployee");
	  contSal=sc.nextDouble();
	  System.out.println("Enter The Bond of Contact");
	  contbond=sc.nextDouble();
   }
   @Override
   public void display() {
	   super.display();
	   System.out.println("The Salary of Contact Employee is "+contSal);
	   System.out.println("The Bond period is "+contbond);
   }
   @Override
   public void calculateSal() {
	   contSal=contSal*contbond;
	   System.out.println("The Total Salary of Contact Employee is"+contSal);
   }
}
