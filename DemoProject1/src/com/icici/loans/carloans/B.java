package com.icici.loans.carloans;

public class B extends A
{
public void m2()
{
	System.out.println("am in m2 class");
}

	public static void main(String[] args)
	{
		B b = new B();
		A a =new A();
		b.m2();
		
		a.m1();
		

	}

}
