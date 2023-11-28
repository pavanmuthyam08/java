package com.iis.studentpercent;

public class classA extends Marks{
	private   double per=90;
	private double sum;
	public classA(int sub1,int sub2,int sub3) {
	  sum=sub1+sub2+sub3;	
	}

	@Override
	public void getPercentage() {
		per=(sum/3);
		System.out.println("The percentage of StudentA is "+per+"%");
		
	}


}
