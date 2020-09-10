package com.example.employer.dao;

import java.util.List;
import com.example.employer.Modal.Employee;

public interface EmployeeDAO {
	List<Employee> get();
	 
	 Employee get(int id);
	 
	 void save(Employee employee);
	 
	 void delete(int id);

}