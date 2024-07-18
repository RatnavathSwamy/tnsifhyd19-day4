package com.day4;//STRINGS ARE IMMUTABLE

public class strings {
	public static void main(String[] args) {
		String k="kittu";//assigning through literal
		String l=new String("chowhan");//assingning through new keyword
		String s=k.concat(l);
		System.out.println(s);
		//k.insert(1,'L');
		//not posible becouse its immutable
		
	}
	

}
//note:we can mute the string by using the method of stringbuffer and stringbuilder