package com.iis.day4assignment;

public class Manager extends Employee{
  public Manager() {
	  
  }
  public Manager(int empid,String empname,String empaddress,Long phno) {
   super(empid,empname,empaddress,phno);
     //basicsal=sal;
	  
  }
  @Override
  public void calculateTransportAllowance() {
	  tranceall=0.15*basicsal;
	   System.out.println("The Traveling Allowances is "+tranceall);
  }
  public static void main(String[] args) {
	Manager m= new Manager(122,"peter","sdggd",28637l);
	m.calculateSalary();
	m.display();
	m.calculateTransportAllowance();
}
}
