package com.yash.Task1;

public class Sweetfruits extends Fruit
{
	String[] fruitinfo=	new String[9];
	String sweetest;
	public Sweetfruits(String fruitname, String fruitcolor, String[] fruitinfo,String sweet) {
		super(fruitname, fruitcolor);
		this.fruitinfo = fruitinfo;
		this.sweetest=sweet;
	}
	public void display(Sweetfruits sf)
	{
		System.out.println("-----Sweet Fruit info----");
		System.out.println("Fruit Name ="+sf.fruitname);
		System.out.println("Fruit Color ="+sf.fruitcolor);
		System.out.println("----Nutrition summary----");
		       for(String s:sf.fruitinfo)
		       {
		    	   System.out.print(s +" ");
		       }
		System.out.println();
		System.out.println("Sweet Fruit bcz of sugar is =" +sf.sweetest);
		System.out.println("----------------------------------");
	}


}
