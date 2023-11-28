package com.iis.LibrariAssignment;

import java.util.Scanner;

public class AdultUser implements LibraryUser{
	Scanner sc=new Scanner(System.in);
	int age;
	String bookType;
	public void accept() {
		System.out.println("If Your are Adult Enter Your Age Else Enter 0");
		age=sc.nextInt();
		
	}
	public void Acc() {
		System.out.println("Enter What type of Book you Required");
		bookType=sc.next();
		
	}
	@Override
	public void registerAccount() {
		if(age>12) {
			System.out.println("You have successfully resistered under a Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be Greaterthan 12 years");
		}
				
	}

	@Override
	public void requresBook() {
		if(bookType.equals("Adults")) {
			System.out.println("Books issued Successfully and Return the Books within 10 Days");
		}
		else {
			System.out.println("Oops, You are allowed to take Kids Books ");
		}
				
	}


}
