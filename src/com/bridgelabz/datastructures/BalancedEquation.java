package com.bridgelabz.datastructures;

import java.util.Stack;

import com.bridgelabz.util.DataStructureProgramming;
import com.bridgelabz.util.StackImplementation;

public class BalancedEquation {

	public static void main(String[] args) {
		StackImplementation st = new StackImplementation();
		System.out.println("Enter expression: ");
		String input = DataStructureProgramming.getString();
		char[] character = input.toCharArray();

		if (DataStructureProgramming.isBalancedParanthesis(character))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
