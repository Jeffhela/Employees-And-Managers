package com.codingdojo.EmployeeAndManagers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.EmployeeAndManagers.models.Employee;

public interface EmployeeRepository extends CrudRepository <Employee, Long> {
	List <Employee> findAll();

}
