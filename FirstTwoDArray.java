package com.demo.set8;

import java.util.Scanner;

public class FirstTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter row");
		int r=sc.nextInt();
		System.out.println("enter column");
		int c=sc.nextInt();
		int [][]arr1=new int [r][c];
		int [][]arr2=new int [r][c];
		int [][]sum=new int [r][c];
		
		System.out.println("enter elements");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr1[i][j]=sc.nextInt();
				
			}
		}
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
				{
					arr2[i][j]=sc.nextInt();
					
				}
			}
				
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
						sum[i][j]=arr1[i][j]+arr2[i][j];
					}
						
						
					}
				for(int i=0;i<r;i++)
				{
					for(int j=0;j<c;j++)
					{
				System.out.print("addition is "+sum[i][j]+" ");
					}
					System.out.println();
				}
			
		
		sc.close();
	}
	

}
