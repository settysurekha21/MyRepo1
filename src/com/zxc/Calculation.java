package com.zxc;

public class Calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Cal c=new Cal(20,20);
        c.add();
        c.sub();
	}

}
class Cal
{  
	private int a;
	private int b;
	Cal(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	 void add()
	{
		System.out.println(a+b);
	}
	 void sub()
	{
		System.out.println(a-b);
	}
}
