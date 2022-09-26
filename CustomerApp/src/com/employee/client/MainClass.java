package com.employee.client;
import java.util.List;
import java.util.Scanner;

import com.employee.model.Employee;
import com.employee.service.EmployeeServiceImpl;
import com.employee.service.IEmployeeService;

public class MainClass {
	public static void main(String[] args) {
		IEmployeeService employeeService=new EmployeeServiceImpl();
		System.out.println("choose list by Category");
		System.out.println("1[]getAll, [2]byCity,[3]getBYId");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		if(input.equalsIgnoreCase("getAll"))
		{		List<Employee>employees=employeeService.getAll();
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		}
		else if(input.equalsIgnoreCase("-bycity"))
			{System.out.println("enter city name");
		String  city=sc.next();
		{		List<Employee>employees=employeeService.getByCity(city);
		for(Employee employee:employees)
		{
			System.out.println(employee);
		}
		}}
		else
		{
			System.out.println("hi");
		}
	}
	

}
