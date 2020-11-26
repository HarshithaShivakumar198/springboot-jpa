package com.epsilon.training.springboot.jpademo.springbootjpademo.dao;

import java.util.List;

import com.epsilon.training.springboot.jpademo.springbootjpademo.model.Employee;

public interface EmployeeDAO {
	
	Employee save(Employee employee);
	List<Employee> getAllEmployees();
	Employee findEmployeeById(int Id);
	List<Employee> findEmployeeByName(String Name);
	List<Employee> findEmployeeByNameAndAge(String Name,int Age);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(int Id);
	boolean deleteEmployee(String Name);
	

}
