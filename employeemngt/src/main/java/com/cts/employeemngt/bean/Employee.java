package com.cts.employeemngt.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="Empl")
@Table(name="empl_table")
public class Employee {
	@Id
private String empId;
private String firstName;
private String lastName;
private float salary;



public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
			+ ", getEmpId()=" + getEmpId() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
			+ ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}

public Employee() {
	// TODO Auto-generated constructor stub
}

public Employee(String empId, String firstName, String lastName, float salary) {
	super();
	this.empId = empId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.salary = salary;
}


}
