package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class QuestionToFindNum {
	public static void main(String[] args) {

		System.out.println("Guess a number between 0 to 127 ");
		int number = AlgorithmProgramming.getInt();
		int low = 0, high = 127;
		int output = AlgorithmProgramming.findYourNumber(number, low, high);
		System.out.println("The number which is guessed is:" + output);
	}

}
