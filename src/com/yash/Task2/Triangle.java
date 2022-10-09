package com.yash.Task2;

import java.util.Scanner;

public class Triangle implements Shape
{

	@Override
	public double area(double base) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height of triangle");
		int height=sc.nextInt();
		
	return (base*height)/2;
	}
	

}
