package com.bridgelabz.functionalprograms;

//import java.util.Scanner;

import com.bridgelabz.util.FunctionalProgramming;

public class HelloReplace {
	public static void main(String[] args)
	{
		String s1 = "username";
		
		System.out.println("Original string");
		String s3="hello <<"+s1+">>,how are you?";
		System.out.println(s3);
		System.out.println("Enter the name to repalce with username");
		String s2 = FunctionalProgramming.getString();
		FunctionalProgramming.replace(s1, s2, s3);
		
	}
}
