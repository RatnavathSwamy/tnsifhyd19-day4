package com.day4;

public class multiplemain implements multipleinterface1,multipleinterface2{
	
	public void kittu()
	{
		System.out.println("my name is kittu in interface 1");
	}
	public void run()
	{
		System.out.println("iam running in interface 2");
	}
	public static void main(String[] args) {
		
	
	multipleinterface1 k=new multiplemain();//here we should create object for the interfaces and we should put the filename after new which class has implementation of that perticular abstract method or implementation
	k.kittu();
	multipleinterface2 l=new multiplemain();
	l.run();
	
}
}
