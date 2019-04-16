package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class MonthlyPayment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{

			double p = Double.parseDouble(args[0]);
			double y = Double.parseDouble(args[1]);
			double r = Double.parseDouble(args[2]);
			double payment = AlgorithmProgramming.monthlyPayment(p, y, r);
			System.out.println(+payment);
		}

	}

}
