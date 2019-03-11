package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class GamblerPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of stakes in a game");
		int stk = FunctionalProgramming.getInt();
		System.out.println("Enter the number of goals in a game");
		int gl = FunctionalProgramming.getInt();
		System.out.println("Enter the number of trails done in a game");
		int tr = FunctionalProgramming.getInt();
		FunctionalProgramming.gambler(stk,gl,tr);
	
	}

}
