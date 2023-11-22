package com.cg.practicingcode;

public class StringReverse{
	// Function to reverse a string in java using StringBuilder
	public static String rev(String s) {
		return new StringBuilder(s).reverse().toString();
	}
	public static void main(String[]args) {
		String s = "Madhavi"; //Note that string is immutable in java
		s=rev(s);
		System.out.println("Result after reversing a string is : "+s);
	}

}
