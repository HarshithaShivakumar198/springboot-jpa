package com.epsilon.training.springboot.jpademo.springbootjpademo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epsilon.training.springboot.jpademo.springbootjpademo.dao.EmployeeDAO;
import com.epsilon.training.springboot.jpademo.springbootjpademo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	Logger log=LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	@Transactional
	public Employee save(Employee employee) {
		return employeeDAO.save(employee);
	}

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		log.info("Method:"+this.getClass().getName()+"in Implementation class");
		return employeeDAO.getAllEmployees();
	}

	@Override
	@Transactional
	public Employee findEmployeeById(int Id) {
		return employeeDAO.findEmployeeById(Id);
	}

	@Override
	@Transactional
	public List<Employee> findEmployeeByName(String Name) {
		return employeeDAO.findEmployeeByName(Name);
	}

	@Override
	@Transactional
	public List<Employee> findEmployeeByNameAndAge(String Name, int Age) {
		return employeeDAO.findEmployeeByNameAndAge(Name, Age);
	}

	@Override
	@Transactional
	public boolean updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	@Transactional
	public boolean deleteEmployee(int Id) {
		return employeeDAO.deleteEmployee(Id);
	}

	@Override
	@Transactional
	public boolean deleteEmployee(String Name) {
		return employeeDAO.deleteEmployee(Name);
	}

}
