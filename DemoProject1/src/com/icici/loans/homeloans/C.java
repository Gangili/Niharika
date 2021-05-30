package com.icici.loans.homeloans;

import com.icici.loans.carloans.A;

public class C extends A
{
public void m3()
{
	System.out.println("am in m3 class");
}
	public static void main(String[] args)
	{
		
       C c = new C();
       A a = new A();
       
       c.m3();
       c.m1();
       
	}

}
