package com.demo.set8;

import java.util.Scanner;

public class Matrixaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int [][]matrix=new int[r][c];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
			
			matrix[r][c]=sc.nextInt();
		}
		}
		int addition=matrix[r][c];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix.length;j++)
			{
			//addition[i][j]=matrix[r][c];
			}
		}
		sc.close();

	}

}
