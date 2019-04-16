package com.bridgelabz.util;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Admin894
 *
 */
public class FunctionalProgramming {

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

	/**
	 * program to check leap year or not
	 * 
	 * @param year
	 */
	public static boolean leapYear(int year) {
		if (year <= 999)
			System.out.println("It is invalid number");

		else if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			return true;
		} else
			System.out.println(" It is not a leap year");
		return true;
	}

	/**
	 * Prints the nth Harmonic value
	 * 
	 * @param num
	 */
	public static void harmonic(int num) {
		float harmonic = 1;
		for (int i = 2; i <= num; i++) {
			harmonic += (float) 1 / i;

		}

		System.out.println(harmonic);
	}

	/**
	 * Power of 2
	 * 
	 * @param num
	 */
	public static void power(int num) {

		// TODO Auto-generated method stub

		int i = 0;
		int power = 1;
		if (num > 31)
			System.out.println("Enter the power of two that are les than 2^" + num);
		while (i <= num) {
			System.out.println("2^" + i + "=" + power);
			power = power * 2;
			i++;
		}
	}

	/**
	 * To find prime factor
	 * 
	 * @param num
	 */
	public static void factors(int num) {
		for (int i = 2; i > 1; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
			}
		}
	}

	/**
	 * Print the username using replace
	 * 
	 * @param username
	 */
	public static void replace(String s1, String s2, String s3) {

		if (s2.length() >= 3) {
			String s4 = s3.replaceAll(s1, s2);
			System.out.println(s4);
		} else {
			System.out.println("Please enter the valid username");
		}
	}

	/**
	 * Percentage of head and tail(flip coin)
	 * 
	 * @param flip
	 */
	public static void flipCoin(int flip) {
		int c = 1;
		double rm;
		int head = 0;
		int tail = 0;
		while (c <= flip) {
			rm = Math.random();
			System.out.println(rm);
			if (rm <= 0.5)
				head++;
			else
				tail++;
			c++;
		}
		System.out.println(tail);
		System.out.println(head);
		System.out.println(flip);
		int headper = head * 100 / flip;
		System.out.println("head perc=" + headper);
		int tailper = tail * 100 / flip;
		System.out.println("tail perc=" + tailper);

	}

	/**
	 * Gambler(Percentage of win and loss)
	 * 
	 * @param stk
	 * @param gl
	 * @param tr
	 */
	public static void gambler(int stk, int gl, int tr) {
		int win = 0;
		int loss = 0;
		for (int i = 0; i < tr; i++) {
			int money = stk;
			while (money > 0 && money < gl) {
				double r = Math.random();
				if (r < 0.5)
					money++;
				else
					money--;
			}
			if (money == gl)
				win++;
			else
				loss++;
		}
		System.out.println(win + " win of " + tr);
		System.out.println("Percentage of winning a game is" + 100.0 * win / tr);
		System.out.println("Percentage of losing a game is" + 100.0 * loss / tr);

	}

	/**
	 * Coupon numbers
	 * 
	 * @param num
	 * @return
	 */
	public static int couponNum(int num) {
		boolean[] isCollected = new boolean[num];
		int c = 0;
		int dist = 0;
		while (dist < num) {
			int value = (int) (Math.random() * num);
			c++;
			if (!isCollected[value])

			{
				dist++;
				System.out.println(dist);
				isCollected[value] = true;
			}
		}
		return c;

	}

	/**
	 * Quadratic equation
	 * 
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void findingRoot(int a, int b, int c) {
		int delta = (b * b) - (4 * a * c);
		if (delta > 0) {
			double rt1 = (-b + Math.sqrt(delta) / (2 * a));
			double rt2 = (-b - Math.sqrt(delta) / (2 * a));
			System.out.println("Roots are unique" + " " + "root=" + rt1 + "rt2=" + rt2);
		} else if (delta == 0) {
			double rt3 = (-b) / (2 * a);
			double rt4 = rt3;
			System.out.println("Roots are equal" + " " + " root=" + rt3);
		} else if (delta < 0) {
			double real = (-b) / (2 * a);
			double imaginary = Math.sqrt(-delta) / (2 * a);
			System.out.println("Roots are real and imaginary");
			System.out.println(real + "+i" + imaginary);
			System.out.println(real + "-i" + imaginary);
		}
	}

	/**
	 * 2 Dimentional Array
	 * 
	 * @param r
	 * @param c
	 * @param arr
	 */
	public static void printArray(int r, int c, Object[][] arr) {
		System.out.println("Enter the next values");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr[i][j] = FunctionalProgramming.getString();
			}
		}
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}
	}

	/**
	 * Simulate Stopwatch program
	 * 
	 * @param stTime
	 * @param endTime
	 */
	public static long stopWatch(long stTime, long endTime) {
		long timeElaps = endTime - stTime;
		return timeElaps;
	}

	/**
	 * Sum of three Integer adds to ZERO
	 * 
	 * @param array
	 * @param num
	 */
	public static void tripleSum(int num, int array[]) {
		boolean found = true;
		for (int i = 0; i < num - 2; i++) {
			for (int j = i + 1; j < num - 1; j++) {
				for (int k = j + 1; k < num; k++) {
					if (array[i] + array[j] + array[k] == 0) {
						System.out.print(array[i]);
						System.out.print(" ");
						System.out.print(array[j]);
						System.out.print(" ");
						System.out.print(array[k]);
						System.out.print("\n");
						found = true;
					}
				}
			}
		}
		if (found == false)
			System.out.println(" not exist ");

	}

	/**
	 * WindChill program
	 * 
	 * @param t
	 * @param v
	 */
	public static double wChill(double t, double v) {
		double wind = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		return wind;
	}

	/**
	 * Distance Program using command line arguments
	 * 
	 * @param x
	 * @param y
	 */
	public static void distance(int x, int y) {
		double dist = Math.sqrt(x * x + y * y);
		System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

	}

	/**
	 * Replace username using regex method
	 * 
	 * @param sentence
	 * @param userName
	 * @return
	 */
	public static String replace2(String sentence, String userName) {
		final String REGEX_USERNAME = "<<userName>>";
		Pattern p = Pattern.compile(REGEX_USERNAME);
		Matcher m = p.matcher(sentence);
		String message = m.replaceFirst(userName);
		sentence = message.replaceAll(REGEX_USERNAME, userName);

		return sentence;
	}

	/**
	 * Coupon numbers 2
	 * 
	 * @param n
	 * @param random
	 */
	public static void isCouponNum(int num) {
		int count = 0, i = 0, j = 0;
		int a[] = new int[num];
		Random t = new Random();

		for (i = 0; i < num; i++) {

			a[i] = t.nextInt(num);
			System.out.println(a[i] + " ");
		}

		System.out.print("Distinct coupons:");
		for (i = 0; i < num; i++) {
			for (j = 0; j < i; j++) {
				if (a[i] == a[j])
					break;
			}
			if (i == j)
				count++;
		}
		System.out.println(count);
	}

	/**
	 * Permutation program
	 * 
	 * @param input
	 */
	public static void permutation(String input) {
		permutation("", input);
	}

	private static void permutation(String perm, String word) {
		if (word.isEmpty()) {
			System.err.println(perm + word);

		} else {
			for (int i = 0; i < word.length(); i++) {
				permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
			}
		}

	}

	/**
	 * Tic toc Toe
	 * 
	 * @param b
	 * @return
	 */
	/**
	 * @param b
	 * @return
	 */
	static final int USER = 1;
	static final int EMPTY = 0;
	static final int NONE = 0;

	static final int COMPUTER = 2;
	static final int STALEMATE = 3;

	public static char printChar(int b) {
		switch (b) {
		case EMPTY:
			return ' ';
		case USER:
			return 'X';
		case COMPUTER:
			return 'O';
		}
		return ' ';
	}

	public static int checkWinner(int[][] board) {
		// Check if someone won
		// Check horizontals

		// top row
		if ((board[0][0] == board[0][1]) && (board[0][1] == board[0][2]))
			return board[0][0];

		// middle row
		if ((board[1][0] == board[1][1]) && (board[1][1] == board[1][2]))
			return board[1][0];

		// bottom row
		if ((board[2][0] == board[2][1]) && (board[2][1] == board[2][2]))
			return board[2][0];

		// Check verticals

		// left column
		if ((board[0][0] == board[1][0]) && (board[1][0] == board[2][0]))
			return board[0][0];

		// middle column
		if ((board[0][1] == board[1][1]) && (board[1][1] == board[2][1]))
			return board[0][1];

		// right column
		if ((board[0][2] == board[1][2]) && (board[1][2] == board[2][2]))
			return board[0][2];

		// Check diagonals
		// one diagonal
		if ((board[0][0] == board[1][1]) && (board[1][1] == board[2][2]))
			return board[0][0];

		// the other diagonal
		if ((board[0][2] == board[1][1]) && (board[1][1] == board[2][0]))
			return board[0][2];

		// Check if the board is full
		if (board[0][0] == EMPTY || board[0][1] == EMPTY || board[0][2] == EMPTY || board[1][0] == EMPTY
				|| board[1][1] == EMPTY || board[1][2] == EMPTY || board[2][0] == EMPTY || board[2][1] == EMPTY
				|| board[2][2] == EMPTY)
			return NONE;

		return STALEMATE;
	}

	// Generate a random computer move
	public static int computer_move(int[][] board) {
		int move = (int) (Math.random() * 9);

		while (board[move / 3][move % 3] != EMPTY)
			move = (int) (Math.random() * 9);

		return move;
	}

}
