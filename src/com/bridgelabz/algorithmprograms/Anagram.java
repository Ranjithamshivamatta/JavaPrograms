package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class Anagram
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.out.println("Enter the first string" );
String firstString = AlgorithmProgramming.getString();
char[] s = firstString.toCharArray();
System.out.println("Enter the second string" );
String secondString = AlgorithmProgramming.getString();
char[] r = secondString.toCharArray();
if(AlgorithmProgramming.isAnagram(s,r))

	System.out.println("The two strings are anagram of each other");
	else
	System.out.println("The two strings are not anagram of each other");
}
}