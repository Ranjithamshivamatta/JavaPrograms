package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.Functionalprogramming;

public class GamblerPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of stakes in a game");
		int stk = Functionalprogramming.intSample();
		System.out.println("Enter the number of goals in a game");
		int gl = Functionalprogramming.intSample();
		System.out.println("Enter the number of trails done in a game");
		int tr = Functionalprogramming.intSample();
		Functionalprogramming.gambler(stk,gl,tr);
	
	}

}
