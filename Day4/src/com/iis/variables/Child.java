package com.iis.variables;

public class Child extends Super
{
   public  Child() 
   {
	  
	  super();
	   System.out.println("we are created the defalut constuctor of child class");
	   System.out.println("the value of x in Child class is"+x);
   }
   public static void main(String[] args) {
	   Child c=new Child();
	   c.Super(20);
	
}
}
