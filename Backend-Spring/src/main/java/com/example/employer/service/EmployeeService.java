package com.example.employer.service;

import java.util.List;

import com.example.employer.Modal.Employee;

	public interface EmployeeService {
		List<Employee> get();
		 
		 Employee get(int id);
		 
		 void save(Employee employee);
		 
		 void delete(int id);
		}

