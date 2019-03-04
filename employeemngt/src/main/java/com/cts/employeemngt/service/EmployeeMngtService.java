package com.cts.employeemngt.service;

import java.util.List;

import com.cts.employeemngt.bean.Employee;



public interface EmployeeMngtService {
	public String insertEmployee(Employee employee);
	public List<Employee> getAllEmployeeByName(String Id);
	public List<Employee> getAllEmployee();
}
