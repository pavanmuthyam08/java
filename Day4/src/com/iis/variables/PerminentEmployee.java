package com.iis.variables;

public class PerminentEmployee extends Employee {
	private int dateofjoin;
	private double sal;
	@Override
	public void accept() {
		super.accept();
		System.out.println("Enter the Date of Joining");
		dateofjoin=sc.nextInt();
		System.out.println("Enter the Salary");
		sal=sc.nextDouble();
	
	}
	@Override
	public void display() {
		super.display();
		System.out.println("Date of Join is "+dateofjoin);
		System.out.println("The Salary is "+sal);
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.accept();
		e.display();
		PerminentEmployee pe=new PerminentEmployee();
		pe.accept();
		pe.display();
	}

}
