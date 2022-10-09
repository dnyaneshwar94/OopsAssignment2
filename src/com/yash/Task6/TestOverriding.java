package com.yash.Task6;

import java.util.Scanner;

public class TestOverriding
{
	public static void main(String[] args) {
		
		Parent p=new Child();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String...");
		String s1=sc.next();
		System.out.println("Enter Secong String...");
		String s2=sc.next();
		p.compreTwoString(s1, s2);
		
	}

}
