package com.icici.loans.carloans;

public class ICICI implements Rbi 
{

	public static void main(String[] args) 
	{
		ICICI obj = new ICICI();
		obj.deposit();
		obj.withdrawl();
	}

	@Override
	public void withdrawl() 
	{
		System.out.println("Iam overridden the withdrawl in icici");
		
	}

	@Override
	public void deposit() 
	{
		
		System.out.println("Iam overridden the deposit in icici");
	}

}
