package com.icici.loans.carloans;

import java.util.Date;

public class A 
{
   public void m1()
   {
   System.out.println("iam in class A");
   }
   public  static void m4()
   {
	   System.out.println("am in m4 static");
   }
   static
   {
	   System.out.println("am static block");
   }
   static
   {
	    Date dt = new Date();
	    System.out.println(dt);
   }
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1();
		A.m4();//through class name or directly(m4())

	}

}
