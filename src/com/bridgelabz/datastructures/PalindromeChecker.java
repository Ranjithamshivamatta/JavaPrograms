package com.bridgelabz.datastructures;

import com.bridgelabz.util.DataStructureProgramming;
import com.bridgelabz.util.Deque;
import com.bridgelabz.util.Node;

public class PalindromeChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node<Character> node = new Node<Character>();

		System.out.println("Enter a String: ");
		String input = DataStructureProgramming.getString();

		// adding each character to the rear of the dequeue
		for (int i = 0; i < input.length(); i++) {
			char character = input.charAt(i);
			node.addRear(character);
		}
		int flag = 0;

		while (node.size > 1) {
			if (node.removeFront() != node.removeRear()) {
				flag = 1;
				break;
			}
		}

		if (flag == 0) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}
}
