package com.icici.loans.carloans;

public class Y extends X //ISA relation
{
    public void m2()
    {
    	System.out.println("am in m2 class y");
    }
    public void m1()
    {
    	System.out.println("am over ridden m1 in class y");
    }
	public static void main(String[] args)
	{
     X x =new X();//HASA relation
     x.m1();
     
      //Y y = new Y();
       //y.m2();
      // y.m1();
       X obj=new Y();
       obj.m1();
       
	}

}
