package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class QuadraticEquation {
	public static void main(String[] args)
	{
		System.out.print("a=");
		int a = FunctionalProgramming.getInt();
		System.out.print("b=");
		int b = FunctionalProgramming.getInt();
		System.out.print("c=");
		int c = FunctionalProgramming.getInt();
		FunctionalProgramming.findingRoot(a,b,c);
	}

}
