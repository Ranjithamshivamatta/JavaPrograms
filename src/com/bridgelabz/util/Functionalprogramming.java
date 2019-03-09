package com.bridgelabz.util;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
	

	public static Double doubleSample()
	{
		return scan.nextDouble();
	}
	
	
	
	/**program to check leap year or not
	 * @param year
	 */
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

	
	
	/**Prints the nth Harmonic value
	 * @param num
	 */
	public static void harmonic(int num)
	{
	float h=1;
	for(int i=2;i<=num; i++)
	{
		h +=(float)1/i;

	}
	

	System.out.println(h);
	}
	



/**Power of  2
 * @param num
 */
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



/**To find prime factor
 * @param num
 */
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



/**Print the username using replace
 * @param username
 */
public static void replace(String s)
{
	String msg = new String("Hello " +s+ " , How are you?  ");
	//System.out.println(msg);

if(s.length()>=3)
{
System.out.println(msg);
}
else{

System.out.println("Invalid username");
}

System.out.println("enter the replacename  ");
String pn=FunctionalProgramming.stringSample();

System.out.println(msg.replace(s,pn));
}





/**Percentage of head and tail(flip coin)
 * @param flip
 */
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



/**Gambler(Percentage of win and loss)
 * @param stk
 * @param gl
 * @param tr
 */
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
		money--;
}
if(money==gl)
	win++;
else
	loss++;
}
System.out.println(win + " win of " +tr);
System.out.println("Percentage of winning a game is" + 100.0 * win / tr);
System.out.println("Percentage of losing a game is" + 100.0 * loss / tr);


}



/**Coupon numbers
 * @param num
 * @return
 */
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



/**Quadratic equation
 * @param a
 * @param b
 * @param c
 */
public static void findingRoot(int a,int b,int c)
{
	int delta = (b*b) - (4*a*c);
	if(delta>0)
	{
		double rt1 = (-b+Math.sqrt(delta)/(2*a));
		double rt2 = (-b-Math.sqrt(delta)/(2*a));
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
public static void printArray(int r,int c,Object[][] arr)
{
	System.out.println("Enter the next values");
	for(int i=0;i<r;i++)
		{
		for(int j=0;j<c;j++)
			{
			arr[i][j] =FunctionalProgramming.stringSample();
			}
		}
	for(int i=0;i<r;i++)
	{
	for(int j=0;j<c;j++)
	{
			System.out.print( arr[i][j] + " ");
		
			}
		System.out.println();
		}
}


/**Simulate Stopwatch program
 * @param stTime
 * @param endTime
 */
public static void stopWatch(long stTime,long endTime)
{
	long timeElaps = endTime - stTime;
	System.out.println("Clock time in  nanosecond = " + timeElaps);
}




/**Sum of three Integer adds to ZERO
 * @param array
 * @param num
 */
public static void tripleSum(int[] array, int num) 
{ 
    boolean found = true; 
    for (int i=0; i<num-2; i++) 
    { 
        for (int j=i+1; j<num-1; j++) 
        { 
     for (int k=j+1; k<num; k++) 
            { 
               if (array[i]+array[j]+array[k] == 0) 
                { 
                    System.out.print(array[i]); 
                    System.out.print(" "); 
                    System.out.print(array[j]); 
                    System.out.print(" "); 
                    System.out.print(array[k]); 
                    System.out.print("\n"); 
                    found = true; 
                } 
            } 
        } 
    } 
    if (found == false) 
        System.out.println(" not exist "); 
 
}


/**WindChill program
 * @param t
 * @param v
 */
public static double wChill(double t,double v)
{
double wind = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v,0.16);
return wind;
}






/**Distance Program using command line arguments
 * @param x
 * @param y
 */
public static void distance(int x, int y) 
{
	double dist = Math.sqrt(x*x + y*y);
    System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

	
}
}
















