package com.bridgelabz.util;

import java.util.Arrays;
import java.util.Scanner;

//import java.util.Scanner;

public class AlgorithmProgramming {
	
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
	
	
	
	public static int[] arr()
	{
		int n =AlgorithmProgramming.getInt();
		int []arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = AlgorithmProgramming.getInt();
		}
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		return arr;

	}

	
	public static float flt()
	{
		float f = scan.nextFloat();
		return f;
	}
	
	public static int primeRange()
	
	{
		int i=0;
		int num=0;
	String primeNum=" ";
		for( i=1;i<=1000;i++)
		{
			int c = 0;
			for( num =i;num>=1;num--)
			{
				if(i%num == 0)

				{
					c = c+1;
				}
			}
			if(c== 2)
			{
				primeNum = primeNum + i + " ";
				
				}
			}
		System.out.println(primeNum);
		return num;
		}

    





/**Anagram program
 * @param str1
 * @param str2
 * @return
 */
public static boolean isAnagram(char[] str1,char[] str2)
{
	
	
	int n1 = str1.length;
	int n2 = str2.length;
	
	if(n1 != n2)
		return false;
	
	Arrays.sort(str1);
	Arrays.sort(str2);
	
	for(int i=0;i<n1;i++)
		if(str1[i] != str2[i])
			
			return false;
	
	return true;
}



/**Bubble Sort
 * @param a
 */
public static void bubbleSort(int a[])
{
	for(int i=0;i<a.length-1;i++)
	{
		for(int j=0;j<a.length-1;j++)
	
			{
				if(a[j]>a[j+1])
				{
					int t = a[j];
					a[j] = a[j+1];
					a[j+1] = t;
				}
			}
		}
	for(int e:a)
	{
		System.out.println(e+ " ");
	}

}



public static void insertString(String str)
{
	char[] array=str.toCharArray();
	int i=0,j=0,w;
	char temp;
	for(i=0;i<array.length;i++)
	{
		for(j=0;j<=i;j++)
		{
			if(array[j]>array[i])
			{
				 temp=array[j];
				array[j]=array[i];
				for(w=i;w>j+1;w--)
				    array[w]=array[w-1];	
                array[w]=temp;
		}
		}
	}
for(int k=0;k<array.length;k++)
	System.out.print(array[k] + " ");
System.out.println(" ");
}

/**Insertion sort using int
 * @param array
 */
public static void intInsertion(int[] array)
{
	int i,j,temp,w;
	for(i=0;i<array.length;i++)
	{
		for(j=0;j<=i;j++)
		{
			if(array[j]>array[i])
			{
				 temp=array[j];
				array[j]=array[i];
				for(w=i;w>j+1;w--)
				{
				    array[w]=array[w-1];
				}
                array[w]=temp;
		}
		}
	}for(int k:array)
	System.out.println(k + " ");
}



}