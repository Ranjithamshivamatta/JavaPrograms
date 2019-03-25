package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmProgramming;

public class NibbleSwapBinary {

	public static void main(String[] args) 
	{
		System.out.println("Enter the number"); 
	    int number = AlgorithmProgramming.getInt();
		int result=AlgorithmProgramming.swapNibbles(number);
		System.out.println("Number after swapping nibbles " +result);
		boolean status=AlgorithmProgramming.isPowerOfTwo(result);
		
		if(status==true)
			System.out.println("The result is a power of two");
		else
			System.out.println("The result is not a power of two");
		}
}

