package com.iis.variables;

public class Demo {
	private static Demo dobj;
	private Demo() {
		
	}
	public static Demo getObj() {
		dobj=new Demo();
		return dobj;
	}
	public void display() {
		System.out.println("We are using Singleton Class now");
	}

}
