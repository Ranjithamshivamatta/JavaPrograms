package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.FunctionalProgramming;

public class SortBubble <T> {
	public static <T extends Comparable<T>> T[] bubble(T[] array){
		for (int j = 0; j < array.length; j++) {
	         for (int i = j + 1; i < array.length; i++) {
	            // comparing strings
	            if (array[i].compareTo(array[j]) < 0) {
	         
	               T temp = array[j];
	               array[j] = array[i];
	               array[i] = temp;
	            }
           
	}
		} for(int k=0;k<array.length;k++) {
        	System.out.println(array[k]);
        }
		return array;
		

	}
	public static  void main(String[] args) {
		System.out.println("enter the number of elements");
		int N= AlgorithmProgramming.getInt();
		String[] array=new String[N];
		System.out.println("enter next element");
		for(int i=0; i<N; i++) {
			array[i]= AlgorithmProgramming.getString();
		}

		long stTime = System.nanoTime();
		
		bubble(array); 
		
		long endTime = System.nanoTime();
		long result=FunctionalProgramming.stopWatch(stTime,endTime);
		System.out.println("elapsed time :"+result);

		}
	}


