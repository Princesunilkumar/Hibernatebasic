package com.cts.employeemngt.service;
import java.util.List;
import com.cts.employeemngt.bean.Employee;
import com.cts.employeemngt.dao.EmployeeMngtDAOImpl;
import com.cts.employeemngt.dao.EmployeeMngtDao;

public class EmployeeMngtServiceImpl implements EmployeeMngtService {

	EmployeeMngtDao dao=new EmployeeMngtDAOImpl();
	public String insertEmployee(Employee employee) {
		return dao.insertEmployee(employee);
		
	}
	public List<Employee> getAllEmployeeByName(String Id)
	{
		return dao.getAllEmployeeByName(Id);
	}
	public List<Employee> getAllEmployee(){
		return dao.getAllEmployee();
	}
}
