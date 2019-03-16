package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmProgramming;

public class TemperatureMeasure {

	public static void main(String[] args) {
		
		       // Converting Fahrenheit to Celsius
		        System.out.println("Enter temperature in Fahrenheit :");
		        float temperatue = AlgorithmProgramming.getFloat();  
		       float celsius =  AlgorithmProgramming.toCelsius(temperatue);
		        
		        
		        System.out.printf("%.02f degree fahrenheit temperature is equal to %.02f degree celsius %n", temperatue, celsius);
		 
		       // Converting Celsius to Fahrenheit
		        System.out.println("Enter temperature in degree celsius :");
		        float temperatue1 = AlgorithmProgramming.getFloat();
		       float fahrenheit =  AlgorithmProgramming.toFahrenheit(temperatue1);
		        
		        System.out.printf("%.02f degree celsius is equal to %.02f degree fahrenheit %n", temperatue1, fahrenheit);
		    }
}

