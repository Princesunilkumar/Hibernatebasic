package com.cts.employeemngt.dao;

import com.cts.employeemngt.bean.Employee;

import java.util.List;

public interface EmployeeMngtDao {
public String insertEmployee(Employee employee);
public String deleteEmployeeById(String Id);
public List<Employee> getAllEmployeeByName(String Id);
public List<Employee> getAllEmployee();
public Employee getEmployeeById(String Id);
public boolean update(String id);

}
