package com.icici.loans.carloans;

public class VariableTypes 
{
     int x = 100;//primitive and instant variable
	
	static String cname = "vmware";//static variable
	public void m1()
	{
	
		//VariableTypes obj = new VariableTypes();
		int x = 20;//local variable
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(cname);
	}
	public static void m2()
	{
		VariableTypes obj = new VariableTypes();
		System.out.println(cname);
		System.out.println(obj.x);
	}
	public static void main(String[] args)
	{
		VariableTypes obj = new VariableTypes();
		System.out.println(obj.x);//non primitive

	}

}
