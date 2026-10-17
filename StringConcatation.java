package com.demo.set8;

import java.util.Scanner;

public class StringConcatation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String fn="mayuri";
//		String ln="changan";
//		System.out.println("Fullname is");
//		String fulln=fn+" "+ln;
//		System.out.println(fulln);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fi name");
		String fin=sc.next();
		System.out.println("enter ls name");
		String ln=sc.next();
		
		System.out.println("Fullname is");
		String fulln=fin+" "+ln;
		System.out.print(fulln);
		
		sc.close();
		
		
	}

}
