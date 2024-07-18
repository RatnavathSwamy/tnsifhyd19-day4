package com.day4;

import java.util.Scanner;

public class arraytwodimensional {

	//private static char[][][] array;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array=new int[2][2];
		System.out.println("matrix formation");
		System.out.println("enter the order of the matrix A:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the order of the matrix B:");
		int m=sc.nextInt();
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
			
			  array[i][j]=sc.nextInt();
			}
		}
		System.out.println("the array elements is:");
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
		
System.out.print(array[i][j]);
			}
		}
	}
}


