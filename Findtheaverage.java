package com.demo.set7;

import java.util.Scanner;

public class Findtheaverage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int sum=0;
		double avg=0.0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			avg=(double)sum/n;
		}
		System.out.println("sum of an array is:"+sum);
		System.out.println("avg of an array is:"+avg);
		sc.close();

	}

}
