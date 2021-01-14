package com.raystech.java;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Connection {
	
	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\nisha\\Desktop\\nishant.txt");
		
		InputStreamReader inputStreamReader=new InputStreamReader(fis);
		
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
		
		System.out.println(bufferedReader.readLine());
		
	}

}
