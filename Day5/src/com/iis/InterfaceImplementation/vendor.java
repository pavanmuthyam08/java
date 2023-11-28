package com.iis.InterfaceImplementation;

public class vendor implements Details,IncometaxDetails
{

	@Override
	public void name() {
		System.out.println("The name of Vendor");
		
	}

	@Override
	public void address() {
		System.out.println("The address of vendor");
		
	}

	@Override
	public void panNumber() {
		System.out.println("The PAN Number of Vendor");
		
	}

	@Override
	public void limit() {
		System.out.println("The limit of vendor");
		
	}

}
