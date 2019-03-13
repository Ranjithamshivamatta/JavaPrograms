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

	
	public static int primeRange()
	{
		int i=0;
		int num=0;
		
		String primeNum = " ";
		
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



}
	

