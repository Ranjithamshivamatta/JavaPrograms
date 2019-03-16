package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    	System.out.println("Enter the no. of Strings: ");
		    	int s=AlgorithmProgramming.getInt();
		    	String[] arr=new String[s];
		    	System.out.println("Enter the Strings ");
		    		for(int i=0;i<s;i++)
		    		{
		    			arr[i]=AlgorithmProgramming.getString();
		    	   }
	               
		    	String[] name=	AlgorithmProgramming.mergeSort(arr);
		   
	       System.out.println("The resultant Strings are:");
	               for (int i=0;i<s;i++)
	               {
		            System.out.println(name[i]);
		        }
		    
	}

}
