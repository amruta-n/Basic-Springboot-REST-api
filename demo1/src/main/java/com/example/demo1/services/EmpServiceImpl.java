package com.example.demo1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.dao.EmpDAO;
import com.example.demo1.entities.Employee;


@Service
public class EmpServiceImpl implements EmpServices {

	@Autowired
	private EmpDAO empDao;
	
	public EmpServiceImpl() {
		/*list = new ArrayList<>();
		list.add(new Employee(2656, "Mira Singh", "Mumbai"));
		list.add(new Employee(1006, "Mayur Raj", "Bangalore"));
		list.add(new Employee(2045, "Amara Khan", "Delhi"));*/
		
		
		
	}
	
	@Override
	public List<Employee> getEmp() {
		return empDao.findAll();
	}

	
	@Override
	public Employee getEmpOne(long empId) {
		return empDao.getById(empId);
	}

	@Override
	public List<Employee> addEmp(Employee emp) {
		empDao.save(emp);
		return empDao.findAll();
	}

	@Override
	public List<Employee> delEmp(long empId) {
		empDao.deleteById(empId);
		return empDao.findAll();
	}

	@Override
	public List<Employee> updateEmp(Employee emp) {
		empDao.save(emp);
		return empDao.findAll();
	}

	

}
