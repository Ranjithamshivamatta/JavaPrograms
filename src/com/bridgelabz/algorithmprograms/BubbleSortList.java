package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgramming;

public class BubbleSortList {

	public static void main(String[] args) {

		System.out.println("Enter size: ");
		int num = AlgorithmProgramming.getInt();
		List<Integer> nos = new ArrayList<>();
		System.out.println("Enter elements:");
		for (int i = 0; i < num; i++) {
			nos.add(AlgorithmProgramming.getInt());
		}
		AlgorithmProgramming.bubbleList(nos, num);
	}
}