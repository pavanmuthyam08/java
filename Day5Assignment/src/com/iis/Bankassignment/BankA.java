package com.iis.Bankassignment;

public class BankA extends Bank
{
  
	private double bal=100;
	@Override
	public void getBalance() {
		System.out.println("The Balance in BankA is $"+bal);
		
	}

}
