package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprogramming;

public class QuadraticEquation {
	public static void main(String[] args)
	{
		System.out.print("a=");
		int a = Functionalprogramming.intSample();
		System.out.print("b=");
		int b = Functionalprogramming.intSample();
		System.out.print("c=");
		int c = Functionalprogramming.intSample();
		Functionalprogramming.findingRoot(a,b,c);
	}

}
