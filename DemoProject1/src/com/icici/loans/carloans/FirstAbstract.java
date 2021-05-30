package com.icici.loans.carloans;

public abstract class FirstAbstract 
{
	int x = 10;
	public void m1()
	{
	System.out.println("am m1 concreate the firstabstract");
	}
     public abstract void m2();
	public static void main(String[] args)
	{
		 FirstAbstract obj=new ChildClass();
		 obj.m1();
		 obj.m2();
		 obj.x=10;
	}

}
