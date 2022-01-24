package com.example.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo1.entities.Employee;

public interface EmpDAO extends JpaRepository<Employee, Long> {

	
}
