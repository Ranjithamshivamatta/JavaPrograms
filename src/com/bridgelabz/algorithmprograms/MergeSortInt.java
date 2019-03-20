package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class MergeSortInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of N: ");
	      int N=  AlgorithmProgramming.getInt();
		  String[]  array= new String[N];
		  System.out.println("Enter Strings : ");
	    	 for (int i = 0; i < N; i++)
		    	 {
	    		array[i] = AlgorithmProgramming.getString();
		    	 }
	    	 
	    	 int n=array.length;

	    	 AlgorithmProgramming.mergeSort(array);
	    	   for(int j=0;j<n;j++) {
	    		   System.out.println(array[j]);
	    	   }
	}

	}