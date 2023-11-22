package com.cg.practicingcode;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num; //actual num is stored in temp, so when actions are performed on num, original num will not be lost
		int rem,sum=0;
		while(num>0) {
		rem=num%10; //store remainder
		sum=sum+(rem*rem*rem);
		num=num/10; //store quotient
		}
		if(temp==sum){
		System.out.println("The given Number is armstrong");
		}
		else {
		System.out.println("The given number is not armstrong");
		}

	}

}
