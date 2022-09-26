package com.employee.service;

import java.util.*;
import com.employee.model.*;

public class EmployeeServiceImpl implements IEmployeeService {

	@Override
	public List<Employee> getAll() {

		return showAll();
	}

	@Override
	public List<Employee> getByCity(String city) {

		List<Employee> employees = showAll();
		List<Employee> employeTemp = new ArrayList<Employee>();
		for (Employee employee: employees) {
			if (employee.getCity().equalsIgnoreCase(city)) {
				employeTemp.add(employee);
			}
		}
		return employeTemp;

	}

	@Override
	public List<Employee> getByDomain(String domain) {

		List<Employee> employees = showAll();
		List<Employee> employeTemp = new ArrayList<Employee>();
		for (Employee employee : employees) {
			if (employee.getDomain().equalsIgnoreCase(domain)) {
				employeTemp.add(employee);
			}
		}
		return employeTemp;
	}

	@Override
	public Employee getByID(int employeeId) {

		List<Employee> employees = showAll();
		for (Employee employee : employees) {
			if (employee.getEmployeeId() == employeeId)
				return employee;

		}
    return null;
	}

	private List<Employee> showAll() {
		Employee employee1 = new Employee("sadik", 3010, "Digital", "Assam");
		Employee employee2 = new Employee("Naveen", 3011, "Digital", "Karnataka");
		Employee employee3 = new Employee("satyaban", 3012, "health", "Hyderabad");

		Employee employee4 = new Employee("vignesh", 3033, "health", "Bangalore");
		Employee employee5 = new Employee("Bikah", 3010, "wealth", "Bangalore");
		Employee employee6 = new Employee("sharan", 3010, "wealth", "huderabad");
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(employee6);
		employees.add(employee5);
		employees.add(employee4);
		employees.add(employee3);
		employees.add(employee2);
		employees.add(employee1);
		return employees;
	}

}
