package com.iis.studentpercent;

public class classB extends Marks{
	private double per;
	private double sum;
	public classB(int sub1,int sub2,int sub3,int sub4) {
	  sum=sub1+sub2+sub3+sub4;	
	}

	@Override
	public void getPercentage() {
		per=sum/4;
		System.out.println("The percentage of StudentB is "+per+"%");

		
	}


}
