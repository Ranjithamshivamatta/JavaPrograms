package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.bridgelabz.util.SinglyLinkedList;

public class HashNumber {

	public static void main(String[] args) throws  IOException {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> ds = new SinglyLinkedList<>();
        SinglyLinkedList<Integer> ds1 = null;

        Map<Integer, SinglyLinkedList<Integer>> map = new HashMap<Integer, SinglyLinkedList<Integer>>();
        for (int i = 0; i <= 10; i++) {
            ds1 = new com.bridgelabz.util.SinglyLinkedList<>();
            map.put(i, ds1);
        }
        FileReader fr = new FileReader("E:\\JavaJ\\Hashnumber.txt");
        BufferedReader br = new BufferedReader(fr);
        int rem;
        String num;
        String delimitor = ",";
        while ((num = br.readLine()) != null) {
            String number[] = num.split(delimitor);
            for (String numb : number) {
                ds.addElement(Integer.parseInt(numb));
            }
        }
        System.out.println("The numbers in the file are:");
        ds.traverse();

        System.out.println();
        int len = ds.size();

        String[] array = new String[len];
        String[] array2 = ds.convArray(array);
        int[] res = ds.convertIntArray(array2);
        int[] sorted = ds.sort(res);

        System.out.println("The sorted array are:");
        for (int s : sorted)
            System.out.print(s + " ");
        System.out.println();
        System.out.println("Diving each number by 11");
        for (int i = 0; i < sorted.length; i++) {
            rem = sorted[i] % 11;
            if (map.isEmpty()) {
                ds1.addElement(sorted[i]);
                map.put(rem, ds1);
            } else {
                ds1 = map.get(rem);
                if (ds1.size() == 0) {
                    ds1.addElement(sorted[i]);
                } else {
                    if (!ds1.search(sorted[i])) {

                        ds1.addElement(sorted[i]);
                    }
                }
                map.put(rem, ds1);
            }
        }

        for (int i = 0; i < map.size(); i++) {
            com.bridgelabz.util.SinglyLinkedList<Integer> list = map.get(i);
            System.out.print(i + "--> ");
            list.traverse();
            System.out.println();
        }


        br.close();
    }


	}


