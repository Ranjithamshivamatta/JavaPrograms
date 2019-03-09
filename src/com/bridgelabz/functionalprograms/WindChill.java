package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class WindChill {

	public static void main(String[] args) {
double t = Double.parseDouble(args[0]);
double v = Double.parseDouble(args[1]);
System.out.println("Temperature is " + t);
System.out.println("Speed of the wind is " + v);
double w = FunctionalProgramming.wChill(t,v);
System.out.println("Wind chill is " +w);
	}

}
