package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgelabz.util.DataStructureProgramming;
import com.bridgelabz.util.SinglyLinkedList;

public class UnorderedList {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		File file = new File("E:\\JavaJ\\List.txt");
		BufferedReader bufferreader = new BufferedReader(new FileReader(file));
		String[] array = new String[50];
		String delimitor = " ";
		String st;
		while ((st = bufferreader.readLine()) != null) {
			array = st.split(delimitor);
		}
		for (String k : array) {
			list.addElement(k);
		}
		list.traverse();
		list.get();
		System.out.println("Enter the key value: ");
		String key = DataStructureProgramming.getString();

		SinglyLinkedList<String> newList = list.searchKey(list, key);

		newList.traverse();
		FileWriter fw = new FileWriter("E:\\JavaJ\\List.txt");
		String data = newList.toString();
		fw.write(data);
		// fw.write("Test ");
		fw.close();

		System.out.println("Unordered List -" + data);
	}

}
