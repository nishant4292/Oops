package com.raystech.java;

public class Rectangle extends Shape {
	private static String color;
	private static int borderwidth;
	private int length;
	private int width;

	public Rectangle() {
		System.out.println("default cons");
	}

	public Rectangle( int length, int width) {
		super(color, borderwidth);
		this.length = length;
		this.width = width;
		System.out.println(+length + width + color + borderwidth);

	}
	public double Area() {
		double d = length * width;
		return d;
}
public static void main(String[] args) {
		Shape s = new Rectangle(10,10);
		System.out.println(s.borderwidth);
		

	}
}
