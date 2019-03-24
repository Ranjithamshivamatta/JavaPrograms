package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.AlgorithmProgramming;

public class InsertionSortList {


	public static void main(String[] args) {
		System.out.println("Enter size: ");
		int n =AlgorithmProgramming.getInt();
		List<String> words = new ArrayList<>();
		System.out.println("Enter the words:");

		for(int i=0;i<=n;i++){
			words.add(AlgorithmProgramming.getString());
		}
		AlgorithmProgramming.insertionSortList(words,n);

	}
}