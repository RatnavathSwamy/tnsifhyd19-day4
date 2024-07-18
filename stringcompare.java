package com.day4;

public class stringcompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="kittu";
		String s2=new String("kittu");
		String s3="swamy";
		String s4="kittu";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(s4));//true
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s1==s4);//true
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//-8
		System.out.println(s1.compareTo(s4));//0
		
		
			//note:equal() used to compare the values
//note:compareto() used to comparing based on values
		//note:== operator which is used to compare the strings by references
	}

}
