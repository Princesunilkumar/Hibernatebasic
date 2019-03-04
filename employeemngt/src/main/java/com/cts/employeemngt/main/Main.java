package com.cts.employeemngt.main;

import com.cts.employeemngt.bean.Employee;
import com.cts.employeemngt.service.EmployeeMngtService;
import com.cts.employeemngt.service.EmployeeMngtServiceImpl;

public class Main {

	public static void main(String args[])
	{
		Employee employee = new Employee("1233", "tapas", "taps", 200);
		EmployeeMngtService ser= new EmployeeMngtServiceImpl();
		ser.insertEmployee(employee);
		System.out.println(ser.getAllEmployee());
		System.out.println(ser.getAllEmployeeByName("tapas"));
		
	}
}
