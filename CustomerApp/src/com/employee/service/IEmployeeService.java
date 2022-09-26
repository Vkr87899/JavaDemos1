package com.employee.service;
import java.util.*;
import com.employee.model.*;
public interface IEmployeeService {

	List<Employee> getAll();
	List<Employee> getByCity(String city);
	List <Employee> getByDomain(String domain);
	Employee getByID(int employeeId);
	
	
}
