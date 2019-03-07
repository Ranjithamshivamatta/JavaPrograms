package com.bridgelabz.functionalprograms;
import java.sql.Time;
import java.util.concurrent.TimeUnit;
import com.bridgelabz.util.FunctionalProgramming;
public class StopWatch {

	public static void main(String[] args) throws InterruptedException
	{
		long stTime = System.currentTimeMillis();
		System.out.println("Starting time of a clock="+ stTime);
		TimeUnit.SECONDS.sleep(5);
		long endTime = System.currentTimeMillis();
		System.out.println("Ending time of a clock=" + endTime);
		FunctionalProgramming.stopWatch(stTime,endTime);
		// TODO Auto-generated method stub

	}

}