package com.demo.set7;

import java.util.Scanner;

public class Countpositivenegativeandzerovalues {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter size");
		int n=sc.nextInt();
		System.out.println("enter array element");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				System.out.println("negative");
			}
			else if(arr[i]==0)
			{
				System.out.println("zero");
			}
			else
			{
				System.out.println("positive");
			}
			
		}
		sc.close();

	}

}
