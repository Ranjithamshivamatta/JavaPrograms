package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class QuadraticEquation {
	public static void main(String[] args)
	{
		System.out.print("a=");
		int a = FunctionalProgramming.intSample();
		System.out.print("b=");
		int b = FunctionalProgramming.intSample();
		System.out.print("c=");
		int c = FunctionalProgramming.intSample();
		FunctionalProgramming.findingRoot(a,b,c);
	}

}
