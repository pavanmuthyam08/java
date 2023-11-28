package com.iis.Bankassignment;

public class BankB extends Bank{
	private double bal=150;
	@Override
	public void getBalance() {
		System.out.println("The Balance in BankA is $"+bal);
	}
}
