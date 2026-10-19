package com.demo.set9;

import java.util.Scanner;

class Empl
{
	int id;
	String name;
	double salary;
	
	Empl(int id,String name,double salary)
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
public class FiveEmp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Empl []e=new Empl[5];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter deatils:-"+(i+1));
		
		System.out.println("enter id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter salary");
		double salary=sc.nextDouble();
		e[i]=new Empl(id,name,salary);
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].display();
			System.out.println("================");
		sc.close();
		}
	}

}
