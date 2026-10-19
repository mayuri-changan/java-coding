package com.demo.set9;

class Employee
{
	int empId;
	String empName;
	double empSalary;
	
	Employee(int empId,String empName,double empSalary)
	{
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
		
	}
	void display()
	{
		System.out.println("enter id:"+empId);
		System.out.println("enter name:"+empName);
		System.out.println("enter salary:"+empSalary);
	}
	
}


	public class CrudApllication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee(10,"Mayuri",25000);
		emp.display();
		
	}
}
