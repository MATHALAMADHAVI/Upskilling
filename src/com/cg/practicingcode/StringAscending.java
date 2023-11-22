package com.cg.practicingcode;

import java.util.Arrays;
import java.util.Scanner;

public class StringAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		char charArray[]=str.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);

	}

}
