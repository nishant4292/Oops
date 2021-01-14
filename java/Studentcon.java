package com.raystech.java;

public class Studentcon {
	private String name;
	private int rollno;
 
	
public Studentcon() {
	System.out.println(" default cons ");
}
public Studentcon(String name,int rollno) {
	this.name=name;
	this.rollno=rollno;
	System.out.println("param cons is");
}
public static void main(String[] args) {
	Studentcon s= new Studentcon("nishant",7);
	System.out.println(s.name);
	System.out.println(s.rollno);
	
}
}
