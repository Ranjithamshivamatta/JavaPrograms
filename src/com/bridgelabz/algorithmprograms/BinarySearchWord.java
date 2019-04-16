package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabz.common.exception.CustomException;
import com.bridgelabz.util.AlgorithmProgramming;

public class BinarySearchWord {

	public static void main(String[] args) {

		try {
			String filePath = "E:\\JavaJ\\Words.txt";
			File file = new File(filePath);
			if (!file.exists()) {
				throw new FileNotFoundException("File not found at path:- " + filePath);
			}
			BufferedReader bufferreader = null/*
												 * new BufferedReader(new
												 * FileReader(file))
												 */;

			String delimitor = ",";

			String[] string = new String[100];
			String word;
			while ((word = bufferreader.readLine()) != null) {
				string = word.split(delimitor);
			}
			System.out.println("Sorted array:");
			AlgorithmProgramming.bubble(string);
			// for (String a: string)
			// if(a!=null)
			// System.out.println(a);

			System.out.println("Enter key value:");
			String key = AlgorithmProgramming.getString();
			AlgorithmProgramming.binary(string, key);
		} catch (Exception e) {
			throw new CustomException("Error Occured while searching element", e);
		}
	}
}
