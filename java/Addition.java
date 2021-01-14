package com.raystech.java;

public class Addition {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(float a,float b,int c) {
		System.out.println(a+b+c);
	}
	public void add(String a,String b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Addition a= new Addition();
		a.add("nishant", "jain");
		a.add(25, 25);
		a.add(12.3f, 25.3f, 12);
	}
}
