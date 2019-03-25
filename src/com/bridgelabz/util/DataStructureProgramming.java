package com.bridgelabz.util;

import java.util.Scanner;

public class DataStructureProgramming {
	private static Scanner scan = new Scanner (System.in);
	
	public static int getInt()
		{
			return scan.nextInt();
		}
		
		
		public static String getString()
		{
			return scan.next();
		}
		

		public static Double getdouble()
		{
			return scan.nextDouble();
		}
		public static Character getChar()
		{
		     return scan.next().charAt(0);
		}
		
		public static Float getFloat()
		{
			return scan.nextFloat();
		}
		
		
		public static <T extends Comparable<T>> void binary(T[] array, T key){
			int length=array.length;
			int first=0;
			int last=length-1;
			int middle=(first+last)/2;
			while(first<=last)
			{
				if(key.compareTo(array[middle])>0)
			      {
			       first=middle+1;
		          }
				
			else if(array[middle].equals(key))
			{
				System.out.println(key+"-found at location-"+middle);
				break;
			}
			else
			{
				last=middle-1;
			}
				middle=(first+last) /2;
		}
		if(first>last)
			System.out.println("key not found");
		}
		
		
	
}
