package com.nacu.employeeapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nacu.employeeapp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
	
}
