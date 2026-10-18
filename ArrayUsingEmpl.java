package com.demo.set9;
import java.util.Scanner;
class EmployeeMember
{
  int id;
  String name;
  double sal;
  EmployeeMember(int id,String name,double sal)
  {
	  this.id=id;
	  this.name=name;
	  this.sal=sal;
  }
  void displayDetails()
  {
	  System.out.println("empl id:"+id);
	  System.out.println("empl name:"+name);
	  System.out.println("empl sal:"+sal);
  }
}
public class ArrayUsingEmpl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeMember[]e=new EmployeeMember[5];
		for(int i=0;i<e.length;i++)
		{
			System.out.println("enter empl details:-"+(i+1));
			System.out.println("enter emp id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("enter emp name");
			String name=sc.next();
			System.out.println("enter emp salray");
			double sal=sc.nextDouble();
			e[i]=new EmployeeMember(id,name,sal);
		}
		for(int i=0;i<e.length;i++)
		{
			e[i].displayDetails();
			System.out.println("------------------------------");
			
		}
		sc.close();
	}

}
