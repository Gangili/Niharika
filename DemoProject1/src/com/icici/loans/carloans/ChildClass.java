package com.icici.loans.carloans;

public class ChildClass extends FirstAbstract
{

	public static void main(String[] args)
	{
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
		obj.x=10;
		

	}

	@Override
	public void m2()
	{
		System.out.println("iam m2 overedden the childclass");
		
	}
	
	public void m1()
	{
		System.out.println("iam m1 overedden the childclass");
	}
		
}
