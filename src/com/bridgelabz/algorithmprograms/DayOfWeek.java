package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class DayOfWeek {

	public static void main(String[] args) {
		System.out.println("Enter the date,month,year");
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		int date = AlgorithmProgramming.dayOfWeek(day, month, year);
		System.out.println(date);
	}

}
