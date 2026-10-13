package com.demo.set7;

import java.util.Scanner;
import java.util.Stack;

public class StackReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string name");
		String s=sc.nextLine();
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			stack.push(s.charAt(i));
		}
		String rev="";
		while (!stack.isEmpty()) {
            rev= rev + stack.pop();
        }

        System.out.println("Reverse String: " + rev);
		
		sc.close();
				

	}

}
