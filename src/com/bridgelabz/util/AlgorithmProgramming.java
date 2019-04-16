package com.bridgelabz.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlgorithmProgramming {
	private static Scanner scan = new Scanner(System.in);

	public static int getInt() {
		return scan.nextInt();
	}

	public static String getString() {
		return scan.next();
	}

	public static Double getdouble() {
		return scan.nextDouble();
	}

	public static Character getChar() {
		return scan.next().charAt(0);
	}

	public static Float getFloat() {
		return scan.nextFloat();
	}

	public static int[] arr() {
		int n = AlgorithmProgramming.getInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = AlgorithmProgramming.getInt();
		}
		for (int e : arr) {
			System.out.print(e + " ");
		}
		System.out.println();
		return arr;

	}

	public static float flt() {
		float f = scan.nextFloat();
		return f;
	}
	
	

	/**
	 * Prime range between two numbers
	 * 
	 * @param startnum
	 * @param endnum
	 */
	public static void primeRange(int startnum, int endnum)

	{
		for (int i = startnum; i < endnum; i++) {
			int count = 0;

			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}

	}

	/**
	 * To find anagram or not
	 * .06/
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isAnagram(char[] firststring, char[] secondstring) {
		int string1 = firststring.length;
		int string2 = secondstring.length;

		if (string1 != string2)
			return false;
		else{
		Arrays.sort(firststring);
		Arrays.sort(secondstring);

		for (int i = 0; i < string1; i++)
			if (firststring[i] == secondstring[i]) {
				return true;
			}
		
		return false;
	}
	}
	
	
	/**Monthly payment
	 * @param p
	 * @param y
	 * @param r
	 * @return
	 */
	public static double monthlyPayment(double principle, double year, double interest) {
		double n = 12 * year;
		double r0 = interest / (12 * 100);
		double monthlypayment = principle * r0 / (1 - Math.pow((1 + r0), -n));
		return monthlypayment;
	}
	
	
	
	/**To find temperature
	 * Celsius temperature to Fahrenheit
	 * 
	 * @param celsius
	 * @return
	 */
	public static float toFahrenheit(float celsius) {
		float fahrenheit = 9 * (celsius / 5) + 32;
		return fahrenheit;
	}
	/**
	 * Converts fahrenheit temperature to celsius
	 *
	 * @param fahrenheit
	 * @return
	 */
	public static float toCelsius(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}


	/**
	 * Vending Machine
	 * 
	 * @param change
	 * @param cash
	 */
	public static void vendingMachine(int[] change, int cash) {
		for (int i = change.length - 1; i >= 0; i--) {
			int count = 0;
			if (cash == 0)
				return;
			else {
				if (cash >= change[i]) {
					count = cash / change[i];
					System.out.println(change[i] + " notes:" + count);
					cash = cash % change[i];
				}
			}
		}
	}
	

	/**
	 * Day of the week
	 * 
	 * @param d
	 * @param m
	 * @param y
	 * @return
	 */
	public static int dayOfWeek(int date, int month, int year) {
		int y0 = year - (14 - month) / 12;
		int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		int m0 = month + 12 * ((14 - month) / 12) - 2;
		int d0 = (date + x + (31 * m0) / 12) % 7;
		return d0;
	}

	
	
	/**
	 * Decimal to Binary
	 * 
	 * @param n
	 */
	public static void decimaToBinary(int input) {

		{
			// array to store binary number
			int[] binaryNum = new int[1000];

			// counter for binary array
			int i = 0;
			while (input > 0) {
				// storing remainder in binary array
				binaryNum[i] = input % 2;
				input = input / 2;
				i++;
			}

			// printing binary array in reverse order
			for (int j = i - 1; j >= 0; j--)
				System.out.print(binaryNum[j]);
		}
	}
	       

	/**MergeSort
	 * @param array
	 */
	public static void mergeSort(String[] array) {
		if (array.length >= 2) {
			String[] left = new String[array.length / 2];
			String[] right = new String[array.length - array.length / 2];

			for (int i = 0; i < left.length; i++) {
				left[i] = array[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = array[i + array.length / 2];
			}
			mergeSort(left);
			mergeSort(right);
			merge(array, left, right);
		}
	}

	public static void merge(String[] array, String[] left, String[] right) {
		int a = 0;
		int b = 0;
		for (int i = 0; i < array.length; i++) {
			if (b >= right.length || (a < left.length && left[a].compareToIgnoreCase(right[b]) < 0)) {
				array[i] = left[a];
				a++;
			} else {
				array[i] = right[b];
				b++;
			}
		}
	}

	

	
	/**BinarySwapNibble
	 * @param x
	 * @return
	 */
	public static int swapNibbles(int x) {
		{
			return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
		}
	}
	/**IsPowerofTwo
	 * @param res
	 * @return
	 */
	public static boolean isPowerOfTwo(int res) {
		return (int) (Math.ceil((Math.log(res) / Math.log(2)))) == (int) (Math.floor(((Math.log(res) / Math.log(2)))));
	}

	
	/**BubbleSortList
	 * @param nos
	 * @param num
	 */
	public static void bubbleList(List<Integer> nos, int num) {
		int i, temp;

		for (i = 0; i < nos.size() - 1; i++) {
			for (int j = 0; j < nos.size() - i - 1; j++) {

				if (nos.get(j) > nos.get(j + 1)) {
					temp = nos.get(j);
					nos.set(j, nos.get(j + 1));
					nos.set(j + 1, temp);

				}
			}
		}
		for (int k : nos) {
			System.out.print(k + " ");
		}

	}

	
	/**InsrtionSortList
	 * @param array
	 * @param n
	 */
	public static void insertionSortList(List<String> array, int n) {

		int i = 0, j = 0, w;
		String temp;
		for (i = 0; i < array.size(); i++) {
			for (j = 0; j <= i; j++) {
				if (array.get(j).compareTo(array.get(i)) > 0) {
					temp = array.get(j);
					array.set(j, array.get(i));
					for (w = i; w > j + 1; w--){
						array.set(w, array.get(w - 1));
					}
					array.set(w, temp);
				}
			}
		}

		for (String k : array)
			System.out.print(k + " ");
		System.out.println(" ");
	}
	

	/**BinarySort-Generic
	 * @param array
	 * @param key
	 */
	public static <T extends Comparable<T>> void binary(T[] array, T key) {
		int length = array.length;
		int first = 0;
		int last = length - 1;
		int middle = (first + last) / 2;
		while (first <= last) {
			if (key.compareTo(array[middle]) > 0) {
				first = middle + 1;
			}

			else if (array[middle].equals(key)) {
				System.out.println(key + "-found at location-" + middle);
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println("key not found");
	}

	
	/**InsrtionSort-Generic
	 * @param array
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		int i = 0, j = 0, w;
		for (i = 0; i < array.length; i++) {
			for (j = 0; j <= i; j++) {
				if (array[j].compareTo(array[i]) > 0) {
					T temp = array[j];
					array[j] = array[i];
					for (w = i; w > j + 1; w--){
						array[w] = array[w - 1];
					}
					array[w] = temp;
				}
			}
		}
		for (T kl : array)
			System.out.println(kl + " ");
		System.out.println(" ");
	}

	/**BubbleSort-Generic
	 * @param array
	 * @return
	 */
	public static <T extends Comparable<T>> T[] bubble(T[] array) {
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				// comparing strings
				if (array[i].compareTo(array[j]) < 0) {

					T temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}

			}
		}
		for (int k = 0; k < array.length; k++) {
			System.out.println(array[k]);
		}
		return array;

	}

	

	/**Question to find your number
	 * @param number
	 * @param low
	 * @param high
	 * @return
	 */
	public static int findYourNumber(int number,int low,int high) 
	{
		int  mid;
		while (low != high) 
		{
			mid = (low + high) / 2;
			System.out.println("enter 1 if no is between " + low + " - " + mid + "\nEnter 2 if no is between "
					+ (mid + 1) + " - " + high);
			int input = AlgorithmProgramming.getInt();
			if (input == 1)
				high = mid;
			else
				low = mid + 1;
		}
		return low;
	}

}
	
	
