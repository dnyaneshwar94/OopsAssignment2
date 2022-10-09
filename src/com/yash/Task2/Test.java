package com.yash.Task2;

import java.util.Scanner;

public class Test 
{
	public static void main(String[] args)
	{
		Shape shape;
		
		Scanner sc=new Scanner(System.in);
		while(true)
		{
	    System.out.println("Enter Number to Find Area -");
		System.out.println("Press 1 For circle" );
		System.out.println("Press 2 For Sphere" );
		System.out.println("Press 3 For Triangle");
		int choice=sc.nextInt();
		switch (choice) 
		{
		case 1:
			shape=new Circle();
			System.out.println("Enter radies of circle");
			int cradies=sc.nextInt();
			
			double area=shape.area(cradies);
			System.out.println("Area of Circle ="+area);
			
			break;

		case 2:
			shape=new Sphere();
			System.out.println("Enter radies of Sphere");
			int sradies=sc.nextInt();
			
			double area1=shape.area(sradies);
			System.out.println("Area of Sphere ="+area1);
			
			break;

		case 3:
			shape=new Triangle();
			System.out.println("Enter Base of Triangle");
			int base=sc.nextInt();
			double area2=shape.area(base);
			System.out.println("Area of Triangle ="+area2);
			break;

		default:
			System.out.println("Enter Valid Number...");
			break;
		}
		
		System.out.println("=========================================");
	}
		
		
	}

}
