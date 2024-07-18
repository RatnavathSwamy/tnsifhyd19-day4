package com.day4;

public class stringbuilder {
	

	public static void main(String[] args) {
		StringBuilder l=new StringBuilder("enter your name");
		l.append(":Ratnavath Swamy");
		System.out.println(l);
		l.insert(25,",");
		System.out.println(l);
	}

}
//note:we can explicitely mutable the string by string builder