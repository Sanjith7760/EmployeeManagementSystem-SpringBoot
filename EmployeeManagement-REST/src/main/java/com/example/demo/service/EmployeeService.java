package com.example.demo.service;

import java.util.List;
import com.example.demo.entity.Employee;

public interface EmployeeService {

	public Employee createEmployee(Employee employee);
	public List<Employee> fetchAllEmployees();
	public Employee fetchEmployeeById(int id);
	public Employee updateEmployee(Employee employee);
	public String deleteEmployee(int id);
	
}
