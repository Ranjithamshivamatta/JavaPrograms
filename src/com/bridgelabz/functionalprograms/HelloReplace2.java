package com.bridgelabz.functionalprograms;

import com.bridgelabz.util.FunctionalProgramming;

public class HelloReplace2 {
public static String s4;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "Hello <<userName>> , How are you?";
System.out.println("original string:  "+sentence);
System.out.println("Enter the name to replace with username:");
String userName = FunctionalProgramming.getString();
System.out.println(FunctionalProgramming.replace2(sentence,userName));

	}

}
