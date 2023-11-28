package com.iis.day4assignment;

public class Trainee extends Employee
{
  public Trainee() {
	  
  }
  public Trainee(int empid,String empname,String empaddress,Long phno) {
	  super(empid,empname,empaddress,phno);
  }
  
  public static void main(String[] args) {
	Trainee t=new Trainee(1324,"pavan","warangal",37652l);
			t.calculateSalary();
	t.display();
	t.calculateTransportAllowance();
}
}
