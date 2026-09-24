package com.demo.set7;

import java.util.Scanner;

public class Countevenandoddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter size");
		int n=sc.nextInt();
		System.out.println("enter array element");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				even++;
			
			}
			else
			{
				odd++;
			}
			
		}
		System.out.println("even numbrr"+even);
		System.out.println("odd numbrr"+odd);
		
		sc.close();
		

	}

}
