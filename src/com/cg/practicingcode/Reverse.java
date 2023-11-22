package com.cg.practicingcode;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String initial, rev="";
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		initial=in.nextLine();
		int length=initial.length();
		for(int i=length-1;i>0;i--);
		int i = 0;
		rev=rev+initial.charAt(i);
		System.out.println("Reverse string: "+rev);
		

	}

	
}
