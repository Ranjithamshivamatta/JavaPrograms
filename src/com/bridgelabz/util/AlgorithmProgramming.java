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
	public static Character getChar()
	{
	     return scan.next().charAt(0);
	}
	
	public static Float getFloat()
	{
		return scan.nextFloat();
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
				primeNum = primeNum  + i + " ";
				
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
		{	
			return false;
		}
	return true;
}



/**Bubble Sort
 * @param a
 */
public static void bubbleSort(int arr[])
{
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1;j++)
	
			{
				if(arr[j]>arr[j+1])
				{
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
		}
	for(int e:arr)
	{
		System.out.println(e+ " ");
	}

}



public static void insertString(String str)
{
	char[] array=str.toCharArray();
	int i=0,j=0,w;
	char temp;
for( i=0;i<array.length;i++)
{
	for(j=0;j<=i;j++)
	{
		if(array[j]>array[i])
		{
			temp = array[j];
			array[j]=array[i];
			array[i]=temp;
			for(w=i;w>j+1;w--)
			{
				array[w] = array[w-1];
			}
			array[w] = temp;
			
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


/**Payment 
	 * @param p
	 * @param y
	 * @param r
	 * @return
	 */
	public static double monthlyPayment(double p, double y, double r)
	{
		double n = 12 * y;
		double r0 = r / (12 * 100);
		double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
		return payment;
	}


	public static void binInt(int[] array, int n, int key) {
		int low = 0;
		int high = n-1;
		int middle = (low + high)/2;

		while( low <=high )
		{
			if ( array[middle] < key )
				low = middle + 1;    
			else if ( array[middle] == key )
			{
				System.out.println(key + " found at location " + middle  + ".");
				break;
			}
			else
				high = middle - 1;

			middle = (low +high)/2;
		}
		if (low > high)
			System.out.println(key + " isn't present in the list\n");
	}



	
 

 

		
	


	
	
	
	/**Celsius temperature to Fahrenheit
	 * @param celsius
	 * @return
	 */
	public static float toFahrenheit(float celsius) {
        float fahrenheit = 9 * (celsius / 5) + 32;
        return fahrenheit;
    }
    /**
    * Converts fahrenheit temperature to celsius
     *
     * @param fahrenheit
     * @return
     */
    public static float toCelsius(float fahrenheit) {
        float celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }

    
    
    /**Vending Machine
     * @param change
     * @param cash
     */
    public static void vendingMachine(int[] change,int cash)
    {
    for(int i=change.length-1;i>=0;i--)
    {
        int count=0;
        if(cash==0)
            return;
        else 
            {
            if(cash>=change[i])
        {
            count=cash/change[i];
            System.out.println(change[i]+" notes:"+count);
            cash=cash-(count*change[i]);
        }
    } 
}

}
    
    /**Day of the week
     * @param d
     * @param m
     * @param y
     * @return
     */
    public static int dayOfWeek(int d,int m,int y)	
    {
      int y0 = y - (14 - m) / 12;
      int x = y0 + y0 / 4 -y0 / 100 + y0 / 400;
      int m0 = m + 12 * ((14 - m) / 12) -2;
      int d0  = (d + x + (31 * m0) / 12) % 7;
      return d0;
    }


	public static void binString(String str, int n1, char key1) {
		// TODO Auto-generated method stub
		
	}
    

    
    
    
/**Decimal to Binary
 * @param n
 */
public static void decimaToBinary(int n) {
	
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
   
        // printing binary array in reverse order 
        for (int j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    } 
}
}

	// TODO Auto-generated method stub
	





		
	
