package com.cg.practicingcode;

import java.util.Scanner;

public class Swap {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int a=s.nextInt();
		int b=s.nextInt();
		/*int c;
		 * c=b;
		 * b=a;
		 * a=c;
		 */
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swaping" +a+""+b);
	}

}
