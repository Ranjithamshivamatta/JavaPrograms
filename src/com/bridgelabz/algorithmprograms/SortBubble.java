package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.FunctionalProgramming;

public class SortBubble <T> {
	
		
	public static <T>  void main(String[] args) {
		System.out.println("enter the number of elements");
		int N= AlgorithmProgramming.getInt();
		String[] array=new String[N];
		System.out.println("enter next element");
		for(int i=0; i<N; i++) {
			array[i]= AlgorithmProgramming.getString();
		}
		long stTime = System.nanoTime();
		AlgorithmProgramming.bubble(array); 
		long endTime = System.nanoTime();
		long result=FunctionalProgramming.stopWatch(stTime,endTime);
		System.out.println("elapsed time :"+result);

		}
	}


