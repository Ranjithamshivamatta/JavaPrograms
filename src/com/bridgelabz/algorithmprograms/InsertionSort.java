package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.FunctionalProgramming;
//import com.bridgelabz.util.FunctionalProgramming;

public class InsertionSort {

	public static void main(String[] args) {
	    long stTime=System.nanoTime();
		System.out.println("Enter array size:");
		int n=AlgorithmProgramming.getInt();
		int[] array=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=AlgorithmProgramming.getInt();
		}
		System.out.println("Sorted array:");
		AlgorithmProgramming.intInsertion(array);
		long endTime=System.nanoTime();
		long time=FunctionalProgramming.stopWatch(stTime, endTime);
		System.out.println("Execution time in nanosecond: "+ time + " ns");

	}
	}

