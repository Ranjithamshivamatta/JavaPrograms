package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.FunctionalProgramming;

public class InsertionSortString {

			public static void main(String[] args) {
				//Input for string sorting
				long startTime = System.nanoTime();
				System.out.println("Enter the string :");
				String str=AlgorithmProgramming.getString();
				System.out.println("Sorted array:");
				AlgorithmProgramming.insertString(str);
			
				long endTime = System.nanoTime();
				long time=FunctionalProgramming.stopWatch(startTime, endTime); 
				System.out.println("Execution time in nanoeconds:" + time +" ns");
			
	}

}
