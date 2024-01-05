package com.test;

import java.util.Arrays;

public class Hello {
	
	public static void main(String[] args) {
		
		String str[] = {"Hi","Test"};				
		Arrays.asList(str).stream().forEach(System.out :: println);
		
		String strLine =	Arrays.asList(str).stream().reduce((a,b) -> a+","+b).get();
		System.out.println(strLine);
	}

}
