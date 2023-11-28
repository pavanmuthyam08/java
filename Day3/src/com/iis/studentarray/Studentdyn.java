package com.iis.studentarray;
import java.util.*;
public class Studentdyn {
  private Scanner sc;
  private Student stdarr[];
  public Studentdyn() {
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
			  count++;
		  }
	  }
	  
  if(count==1) {
	  System.out.println("The Id present in The Stiudent");
  }
  else {
	  System.out.println("the id is not fount in student Data");
  }
  }
  public static void main(String[] args) {
	Studentdyn sa=new Studentdyn();
	sa.accept();
	//sa.display();
	sa.search();
}
}
