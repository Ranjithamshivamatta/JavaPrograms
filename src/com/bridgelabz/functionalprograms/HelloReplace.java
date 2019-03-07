package com.bridgelabz.functionalprograms;

//import java.util.Scanner;

import com.bridgelabz.util.FunctionalProgramming;

public class HelloReplace {
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter user name");
		String username = FunctionalProgramming.stringSample();
		
		//String message = scan.nextLine();
		
		FunctionalProgramming.helloReplace(username);
		
	}
}
