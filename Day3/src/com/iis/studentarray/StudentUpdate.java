package com.iis.studentarray;
import java.util.*;
public class StudentUpdate {
	  private Scanner sc;
	  private Student stdarr[];
	  public StudentUpdate() {
		sc=new Scanner(System.in);
		System.out.println("Enter the number of Student Details");
		int index=sc.nextInt();
		stdarr = new Student[index];
	  }
	  public void accept() {
		  for(int i=0;i<stdarr.length;i++) {
			  stdarr[i]=new Student();
			  System.out.println("Enter the Student Id");
			  stdarr[i].setSid(sc.nextInt());
			  System.out.println("Enter the name if Student ");
			  stdarr[i].setSname(sc.next());
			  System.out.println("Enter the Score of Student ");
			  stdarr[i].setScore(sc.nextInt());
		  }
	  }
	  public void display() {
		  for(Student s:stdarr) {
			  System.out.println("The Name of Student is "+s.getSid());
			  System.out.println("The Student Name is "+s.getSname());
			  System.out.println("The Score of Student is "+s.getScore());
			  
		  
		  }
	  }
	  public void search() {
		  int id;
		  int count=0;
		  System.out.println("Enter the Student id ");
		  id=sc.nextInt();
		  for(Student sd:stdarr) {
			  if(sd.getSid()==id) {
				  System.out.println("Enter the Name of the Student ");
				  sd.setSname(sc.next());
				  
			  }
		  }
		  
	  
	  }
	  public static void main(String[] args) {
		StudentUpdate sa=new StudentUpdate();
		sa.accept();
		sa.display();
		sa.search();
		sa.display();
	}
	}



