package javaSessions;

import java.awt.CardLayout;

public class Day10_Car {
	
	String name;
	double price;
	String color;
	String modelname;
	
	public Day10_Car(String name,double price,String color, String modelname)
	{
		this.name=name;
		this.price=price;
		this.color=color;
		this.modelname=modelname;
		
		
	}
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getModelName()
	{
		return modelname;
	}
	
	public Day10_Car()
	{
		System.out.println("0 param cons");
	}
	public Day10_Car(int a)
	{
		System.out.println("1 param cons");
		System.out.println(a);
	}
	
	public Day10_Car(int a,int b)
	{
		System.out.println("2 param cons");
		System.out.println(a+ " " +b);
	}

	public static void main(String[] args) {
		
	/*	Day10_Car c1= new Day10_Car();
		Day10_Car c2= new Day10_Car(10);
		Day10_Car c3= new Day10_Car(10,20);*/
		
		Day10_Car c11= new Day10_Car("BMW", 11.22, "Black","320d");
		System.out.println(c11.name+ " " +c11.price+ " " +c11.color+ " " +c11.modelname);
		
		System.out.println(c11.getName());
		System.out.println(c11.getColor());
		System.out.println(c11.getPrice());
		System.out.println(c11.getModelName());
		
		
		Day10_Car c22= new Day10_Car("Honda",17.99, "White","ivtecg");
		System.out.println(c22.name+ " " +c22.price+ " " +c22.color+ " " +c22.modelname);
	}
	

}
