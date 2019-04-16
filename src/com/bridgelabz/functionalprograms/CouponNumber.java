package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class CouponNumber {

	public static void main(String[] args) { 

		System.out.println("Enter the number of coupons");
		int num = FunctionalProgramming.getInt();
		FunctionalProgramming.isCouponNum(num);
		;
	}
}