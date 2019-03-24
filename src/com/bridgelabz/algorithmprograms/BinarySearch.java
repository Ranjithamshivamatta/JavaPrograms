package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

import com.bridgelabz.util.FunctionalProgramming;


public class BinarySearch {

	
	public static <T> void main(String[] args) {
		long stTime = System.nanoTime();
		System.out.println("enter the number of elements");
		int N= AlgorithmProgramming.getInt();
		String[] array=new String[N];
		System.out.println("enter next element");
		for(int i=0; i<N; i++) {
			array[i]= AlgorithmProgramming.getString();
		}
	     AlgorithmProgramming.bubble(array);
		System.out.println("enter the key you want to search");
		String key=AlgorithmProgramming.getString();
	    AlgorithmProgramming.binary(array,key);
		long endTime = System.nanoTime();
		long result=FunctionalProgramming.stopWatch(stTime,endTime);
		System.out.println("elapsed time :"+result);
		}
}