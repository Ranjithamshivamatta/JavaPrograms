package com.bridgelabz.algorithmprograms;

public class SquareRoot {

	public static void main(String[] args) {

		{
			double value = Double.parseDouble(args[0]);
			double epsilon = 1e-15; // relative error tolerance
			double t = value; // estimate of the square root of c
			// repeatedly apply Newton update step until desired precision is
			// achieved
			while (Math.abs(t - value / t) > epsilon * t) {
				t = (value / t + t) / 2.0;
			}
			// print out the estimate of the square root of c
			System.out.println(t);
		}
	}

}
