package com.bridgelabz.util;
import java.util.Scanner;
/**
 * @author Admin894
 *
 */
public class FunctionalProgramming {
	
	private static Scanner scan = new Scanner (System.in);
	
	public static int intSample()
	{
		return scan.nextInt();
	}
	public static String stringSample()
	{
		return scan.next();
	}

	/*leapYear*/
	public static void leapYear(int year)
	{
		if(year<=999)
			System.out.println("It is invalid number, enter the four digit number");
		

		else if(((year % 4 == 0)&&( year % 100 != 0))||( year % 400 == 0))
	{
	  System.out.println("It is a leap year");
	}
	else
System.out.println(" It is not a leap year");
	}

	
	
	
	
	/*harmonic*/
	
	public static void harmonic(int num)
	{
	float h=1;
	for(int i=2;i<=num; i++)
	{
		h +=(float)1/i;

	}
	

	System.out.println(h);
	}
	


/*power*/

public static void power(int num) 
{
	
	// TODO Auto-generated method stub
	
	int i=0;
	int power =1;
	if (num>31)
	System.out.println("Enter the power of two that are les than 2^"+num);
	while( i<=num)
	{
	System.out.println("2^" +i+ "=" +power);
	power = power * 2;
	i++;
}

}

/*Factors*/

public static void factors(int num)
{
for(int i=2;i>1;i++)
{
	while(num % i == 0)
	{
		System.out.println(i + " ");
		num = num/i;
	}



}


}


/*helloReplace*/
public static void helloReplace(String username)
{
	//System.out.println("Enter username");
String msg = new String(" Hello " + username + ",How are you");
if(username.length()>=3)
{
System.out.println(msg);
}
else
{
System.out.println("Invalid username");

}
System.out.println("enter the replacename");
String message = stringSample();
System.out.println(msg.replace(username,message));
}




/*flipCoin*/
public static void flipCoin(int flip)
{
int c=1;
double rm;
int head=0;
int tail=0; 
while(c<=flip)
{
	rm = Math.random();
	System.out.println(rm);
	if(rm<=0.5)
		head++;
	else 
		tail++;
	c++;
}
System.out.println(tail);
System.out.println(head);
System.out.println(flip);
int headper = head*100/flip;
System.out.println("head perc="+headper);
int tailper = tail*100/flip;
System.out.println("tail perc="+tailper);
	
	}



/*gambler*/
public static void gambler(int stk,int gl,int tr)
{
int win = 0;
int loss = 0;
for (int i=0; i<tr;i++)
{
	int money = stk;
while(money>0 && money<gl)
{
	double r = Math.random();
	if(r<0.5)
		money++;
	else
		money++;
}
if(money==gl)
	win++;
else
	win--;
}
System.out.println(win + " win of " +tr);
System.out.println("Percentage of winning a game is" + 100.0 * win / tr);
System.out.println("Percentage of losing a game is" + 100.0 * loss / tr);


}

/*Coupon numbers*/
public static int couponNum(int num)
{
	boolean[] isCollected = new boolean[num];
	int c = 0;
	int dist = 0;
	while (dist < num)
	{
		int value = (int) (Math.random() * num);
		c++	;	
		if (!isCollected[value])
			
		{
			dist++;
			System.out.println(dist);
			isCollected[value] = true;
		}
	}
		return c;
		
	
}

/*Quadratic Equation*/

public static void findingRoot(int a,int b,int c)
{
	int delta = (b*b) - (4*a*c);
	if(delta>0)
	{
		double rt1 = (-b+Math.sqrt(delta)/(2*a));
		double rt2 = (-b+Math.sqrt(delta)/(2*a));
		System.out.println("Roots are unique" + " " + "root=" + rt1 + "rt2=" +rt2 );	
	}
	else if (delta == 0)
	{
		double rt3 = (-b)/(2*a);
		double rt4 = rt3;
		System.out.println("Roots are equal" + " " + " root=" +rt3);
	}
	else if (delta<0)
	{
		double real = (-b)/(2*a);
		double imaginary = Math.sqrt(-delta)/(2*a);
		System.out.println("Roots are real and imaginary");
		System.out.println(real + "+i" + imaginary);
		System.out.println(real + "-i" + imaginary);
	}
}




/**2 Dimentional Array
 * @param r
 * @param c
 * @param arr
 */
public static void printArray(int r,int c,int arr[][])
{
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			System.out.print(+ arr[i][j] + " ");
		
			}
		System.out.println();
		}
}


/**stopwatch
 * @param stTime
 * @param endTime
 */
public static void stopWatch(long stTime,long endTime)
{
	long timeElaps = endTime - stTime;
	System.out.println("Clock time in  millisecond = " + timeElaps);
}










}


















