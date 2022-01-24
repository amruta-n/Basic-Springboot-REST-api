package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo1.entities.Employee;
import com.example.demo1.services.EmpServices;

@RestController
public class MyContrlr {
	
	@Autowired
	private EmpServices empSer;

	@GetMapping("/home")
	public List<Employee> getEmpAll() {
		return this.empSer.getEmp();
	}
	
	@GetMapping("/home/{empId}")
	public Employee getEmpOne(@PathVariable long empId){
		 
		return this.empSer.getEmpOne(empId);
	}
	
	@PostMapping("/home")
	public List<Employee> postEmp(@RequestBody Employee emp) {
		
		return this.empSer.addEmp(emp);
	}
	
	@PutMapping("/home")
	public List<Employee> putEmp(@RequestBody Employee emp) {
		
		return this.empSer.updateEmp(emp);
	}
	
	@DeleteMapping("/home/{empId}")
	public List<Employee> delEmp(@PathVariable long empId) {
		return this.empSer.delEmp(empId);
	}
	
}
