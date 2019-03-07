package com.bridgelabz.functionalprograms;

//import java.util.Scanner;

import com.bridgelabz.util.Functionalprogramming;

public class HelloReplace {
	public static void main(String[] args)
	{
		//Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter user name");
		String username = Functionalprogramming.stringSample();
		
		//String message = scan.nextLine();
		
		Functionalprogramming.helloReplace(username);
		
	}
}
