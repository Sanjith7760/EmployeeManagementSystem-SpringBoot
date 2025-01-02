package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee createEmployee(Employee employee) {
		return  employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById (int id) {
		return employeeRepository.findById(id).orElse(null); 
	
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployee(int id) {
		employeeRepository.deleteById(id);
		return "DELETED SUCCESSFULLY";
	}

}
