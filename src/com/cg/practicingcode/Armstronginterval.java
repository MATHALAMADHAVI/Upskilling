package com.cg.practicingcode;

public class Armstronginterval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num <= 500; num++) {
			// dtermine the number of digits in the number
			int order = String.valueOf(num).length();
			
			//initialize the sum of cubes of each digit
			int sum = 0;
			
			//find the sum of cubes of each digit
			int temp = num;
			while (temp > 0) {
				int digit = temp%10;
				sum+= Math.pow(digit,  order);
				temp /= 10;
			}
			
			//check if the number is an Armstrong number
			if (num == sum) {
				System.out.println(num);
			}
		}
	}
}
		