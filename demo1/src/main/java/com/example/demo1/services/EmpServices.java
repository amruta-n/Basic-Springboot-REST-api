package com.example.demo1.services;

import java.util.List;

import com.example.demo1.entities.Employee;

public interface EmpServices {

	public List<Employee> getEmp();

	public Employee getEmpOne(long empId);

	public List<Employee> addEmp(Employee emp);

	public List<Employee> delEmp(long empId);

	public List<Employee> updateEmp(Employee emp);
	
}
