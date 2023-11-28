package com.iis.studentarray;

public class Studentmain {
	private Student stdarr[];
	public Studentmain() {
		stdarr=new Student[3];
	}
	public void accept() {
		stdarr[0]=new Student();
		stdarr[0].setSid(1);
		stdarr[0].setSname("PAVAN");
		stdarr[0].setScore(85);
		stdarr[1]=new Student();
		stdarr[1].setSid(2);
		stdarr[1].setSname("RAMESH");
		stdarr[1].setScore(90);
		stdarr[2]=new Student();
		stdarr[2].setSid(3);
		stdarr[2].setSname("VISHNU");
		stdarr[2].setScore(97);
	}
	public void display() {
		for(Student s:stdarr) {
			System.out.println("The student Id is "+s.getSid());
			System.out.println("the Student name is "+s.getSname());
			System.out.println("The Student Score is "+s.getScore());
		}
	}
    public static void main(String[] args) {
    	Studentmain sm=new Studentmain();
    	sm.accept();
    	sm.display();
		
	}
}
