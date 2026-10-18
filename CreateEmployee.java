package com.demo.set9;
class Employeee
{
	int id;
	String name;
	double salary;
	
	Employeee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	void display()
	{
		System.out.println("employee id:"+id);
		System.out.println("employee name:"+name);
		System.out.println("employee salary:"+salary);
	}
}
public class CreateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeee e=new Employeee(10,"Mayuri",25000);
		e.display();

	}

}
