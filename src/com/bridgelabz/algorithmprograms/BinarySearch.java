package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.FunctionalProgramming;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("Give an input value");
			int input= AlgorithmProgramming.getInt();
			if(input==1)
				System.out.println("Perform binary search operation for integers");
			if(input==2)
				System.out.println("Perform binary search operation for String");
			long startTime = System.nanoTime();
			switch (input) {
			case 1:
				int i;
				System.out.println("Enter number of elements");
				int n = AlgorithmProgramming.getInt();
				int[] array=new int[n];
				System.out.println("Enter " + n + " integers");
				for(i=0;i<n;i++)
				{
					array[i]=AlgorithmProgramming.getInt();
				}
				System.out.println("Enter the key");
				int key=AlgorithmProgramming.getInt();
	            AlgorithmProgramming.binInt(array, n, key);
				break;
			case 2:
	            System.out.println("Enter the String :");
				String str = AlgorithmProgramming.getString();
				
				System.out.println("Enter the key");
				char key1=AlgorithmProgramming.getChar();
				int n1=str.length();
				AlgorithmProgramming.binString(str, n1,key1);
				break;
	        default:
				break;
			}
	        long endTime = System.nanoTime();
			long elapsed_time = FunctionalProgramming.stopWatch(startTime, endTime);
			System.out.println("The time taken to perform binary search operation is "+ elapsed_time+"ns");
		}
	
	}


