package com.bridgelabz.datastructures;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructureProgramming;

public class PrimeAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> a1 = new ArrayList<List<Integer>>();
        int start = 0;
        int end = 1000;
        List<Integer> lst = DataStructureProgramming.primeNumbers(start, end);
        List<Integer> list = DataStructureProgramming.anagramPrime(lst);
        List<Integer> lst1 = new ArrayList<>();
        lst1.addAll(list);
        a1.add(lst1);
        for (int i = 0; i < lst1.size(); i++) {
            if (lst.contains(lst1.get(i))) {
                lst.remove(lst1.get(i));
            }
        }
        a1.add(lst);
        DataStructureProgramming.printPrimeAndAnagram(a1);
    }


	}


