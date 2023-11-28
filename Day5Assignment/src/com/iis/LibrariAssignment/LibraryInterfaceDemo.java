package com.iis.LibrariAssignment;

public class LibraryInterfaceDemo {
   public static void main(String[] args) {
	   KidUser k=new KidUser();
	k.access();
	k.registerAccount();
	if(k.age<12&&k.age>=0) {
	k.Acc();
	k.requresBook();
	}
	else 
     {
		System.out.println("Enter The Valid Age");
	}
	AdultUser a=new AdultUser();
	
	a.accept();
	if(a.age>12) {
	a.registerAccount();
		a.Acc();
		a.requresBook();
	}

	
}
}
