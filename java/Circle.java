package com.raystech.java;

public class Circle extends Shape {
	private int radius=5;
	public Circle() {
		System.out.println("default cons");
	}
public Circle (int radius,int borderwidth,String color) {
	super(color, borderwidth);
	this.radius=radius;
	System.out.println(+radius +borderwidth +"color");
}
public double Area() {
	double d=3.14*radius*radius;
	return d;
}
public static void main(String[] args) {
	Circle c=new Circle();
	System.out.println(c.borderwidth);
	System.out.println(c.Area());
	System.out.println(c.color);
	
}
}
