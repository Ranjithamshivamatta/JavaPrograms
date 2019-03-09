package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class TripletSum {

	public static void main(String[] args) {
	
        System.out.println("Enter the value of num");
		int num =FunctionalProgramming.intSample();
		int array[] = new int[num];
		System.out.println("Enter the value");
		
		for(int i=0;i<num;i++)
		{
			
			array[i] = FunctionalProgramming.intSample();
		}
	    FunctionalProgramming.tripleSum(array,num);
	}
}
