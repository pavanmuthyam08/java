package com.iis.Bankassignment;

public class BankC extends Bank{
	private double bal=100;
	@Override
	public void getBalance() {
		System.out.println("The Balance in BankA is $"+bal);
	}	
}
