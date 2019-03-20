package com.bridgelabz.algorithmprograms;


import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgramming;

public class BubbleSortLink {

	public static void main(String[] args) {
		
		
			System.out.println("Enter size: ");
			int n =AlgorithmProgramming.getInt();
			List<Integer> nos = new ArrayList<>();
			System.out.println("Enter elements:");
			for(int i=0;i<n;i++){
				nos.add(AlgorithmProgramming.getInt());
			}
			AlgorithmProgramming.bubbleList(nos, n); 
		}
}