package com.icici.loans.carloans;

public class FirstClass 
{
    
	int a=10,b=30,results;
    public void add()
    {
    	results=a+b;
    	System.out.println("Result of A & B is : " + results);
    }
    public void sub()
    {
       results=a-b;
       System.out.println("Result of A & B is : " + results);
    }
	public static void main(String[] args) 
	{
		System.out.println("hello");
		 FirstClass obj = new FirstClass();
		 obj.add();
		 obj.sub();
		  FirstClass obj1 = new FirstClass();
		  obj1.add();

	}

}
