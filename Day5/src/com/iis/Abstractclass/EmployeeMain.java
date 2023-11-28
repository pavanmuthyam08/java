package com.iis.Abstractclass;
import java.util.*;
public class EmployeeMain {
	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  Employee eobj;
  
  System.out.println("Enter Your Type of Employeement");
  System.out.println("1. Perminent Employee");
  System.out.println("2. Contact Employee");
  int chooice=sc.nextInt();
  
switch(chooice) {
  case 1:
	  eobj=new PermientEmployee();
	  eobj.accept();
	  eobj.display();
	  eobj.calculateSal();
	  break;
  case 2:
	  eobj=new ContactEmployee();
	  eobj.accept();
	  eobj.display();
	  eobj.calculateSal();
	  break;
	  
  }
	}
  
}
