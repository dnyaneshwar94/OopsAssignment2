package com.yash.Task5;

//Method overloading with two function

public class MaxArrayString
{
	public void m1(String ar[])
	   {

	int max=0;
	int ind=0;
	for(int i=0;i<ar.length;i++)
	{
		if(ar[i].length()>max)
		{
		max=ar[i].length();
		ind=i;
		}
	}

	System.out.println("max length string is ="+ ar[ind]);
	}
	 
	public void m1(int ar[])
	{

	int max=0;


		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
			}
		}
		System.out.println("max no is =" +max);
		
	}


	public static void main(String[] args) 
	{
		int ar1[]= {36,15,49,88,77,43};
		String ar2[]= {"am","ajay","dnyaneshwar","ram","virat"};
		MaxArrayString m=new MaxArrayString();
		m.m1(ar1);
	}

}
