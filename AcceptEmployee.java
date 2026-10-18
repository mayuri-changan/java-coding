package com.demo.set9;

import java.util.Scanner;

class Emp
{
	int id;
	String name;
	double salary;
	
	Emp(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("employee id:-"+id);
		System.out.println("employee name:-"+name);
		System.out.println("employee salary:-"+salary);
	}
}
public class AcceptEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		Emp e=new Emp(id,name,salary);
		e.display();
		sc.close();

	}

}
