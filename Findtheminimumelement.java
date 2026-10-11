package com.demo.set7;

import java.util.Scanner;

public class Findtheminimumelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("enter array element which you want");
		int []arr=new int [n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("minimum element is:"+min);
		sc.close();

	}

}
