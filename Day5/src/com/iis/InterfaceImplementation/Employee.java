package com.iis.InterfaceImplementation;

public class Employee implements IncometaxDetails,Details
{

	@Override
	public void name() {
		System.out.println("The Name of Employee");
		
	}

	@Override
	public void address() {
		System.out.println("The Address of Employee");
		
	}

	@Override
	public void panNumber() {
		System.out.println("The PAN Number of employee");
		
	}

	@Override
	public void limit() {
		System.out.println("The limit of of Employee");
		
	}

}
