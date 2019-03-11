package com.bridgelabz.functionalprograms;
//import java.util.Scanner;
import com.bridgelabz.util.FunctionalProgramming;

public class CouponNumbers {
public static void main(String[] args)
{

	System.out.println("Enter the number of coupons");
	int num = FunctionalProgramming.getInt();
	 int c=FunctionalProgramming.couponNum(num);
	 System.out.println(c);
}
}


