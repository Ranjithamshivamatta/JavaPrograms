package com.bridgelabz.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import com.bridgelabz.util.AlgorithmProgramming;

public class UnorderedList {

	public static void main(String[] args) throws Exception
	{
			// TODO Auto-generated method stub
		
			File file = new File("E:\\JavaJ\\Words.txt"); 
	        BufferedReader br = new BufferedReader(new FileReader(file)); 
			
			String delimitor = ",";
			
			String[] string=new String[100];
			String st;
			while ((st = br.readLine()) != null)
			{
				 string=st.split(delimitor);
			}
			System.out.println("Sorted array:");
			AlgorithmProgramming.bubble(string);
			//for (String a: string) 
				//if(a!=null)
				//System.out.println(a);
			

		   System.out.println("Enter key value:");
		   String key=AlgorithmProgramming.getString();
		   AlgorithmProgramming.binary(string, key);
		}
		}


	

