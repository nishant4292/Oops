package com.raystech.java;

public class Studentol {
	private String name;
	private int age;
	private int rollno;

	public  Studentol() {
		System.out.println("default cons");
	}
		
		 public Studentol(String name,int age) {
			 this();
			 this.name=name;
			 this.age=age;
			 System.out.println("2para" +name +age );
		 }
			 public Studentol(String name,int age,int rollno) {
				 this(name, age);
				 this.rollno=rollno;
				 System.out.println("3 para"+name +age +rollno );
				 
			 }
					 public static void main(String[] args) {
						Studentol s= new Studentol("nishant",28,70);
						
					}
		
	
	}


