package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class BinaryBubbleInsertion {

	public static void main(String[] args) {
		System.out
				.println("press 1 for Binary Search" + "\n Press 2 for Bubble sort" + "\n press 3 for Insertion Sort");
		int n = AlgorithmProgramming.getInt();
		switch (n) {
		case (1):
			BinarySearch.main(args);
			break;
		case (2):
			BubbleSort.main(args);
			break;
		case (3):
			InsertionSort.main(args);
			break;
		}
	}

}
