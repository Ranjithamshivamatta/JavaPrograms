package com.bridgelabz.datastructures;

import com.bridgelabz.util.AlgorithmProgramming;
import com.bridgelabz.util.FunctionalProgramming;

public class Calendar {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]); // month (Jan = 1, Dec = 12)
		int year = Integer.parseInt(args[1]); // year

		/*
		 * months[i] = name of month i
		 * 
		 */
		String[] months = { "", // leave empty so that months[1] = "January"
				"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };

		/*
		 * days[i] = number of days in month i
		 * 
		 */
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		/*
		 * check for leap year
		 * 
		 */
		if (month == 2 && FunctionalProgramming.leapYear(year))
			days[month] = 29;

		/*
		 * print calendar header
		 * 
		 */
		System.out.println("   " + months[month] + " " + year);
		System.out.println(" S  M T  W Th  F  S");

		/*
		 * starting day
		 * 
		 */
		int d = AlgorithmProgramming.dayOfWeek(1,month,year);

		/*
		 * print the calendar
		 */
		for (int i = 0; i < d; i++)
			System.out.print("   ");
		for (int i = 1; i <= days[month]; i++) {
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[month]))
				System.out.println();
		}

	}
}
