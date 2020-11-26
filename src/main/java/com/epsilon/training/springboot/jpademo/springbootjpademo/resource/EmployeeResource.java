package com.epsilon.training.springboot.jpademo.springbootjpademo.resource;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epsilon.training.springboot.jpademo.springbootjpademo.model.Employee;
import com.epsilon.training.springboot.jpademo.springbootjpademo.service.EmployeeService;


@RestController
public class EmployeeResource {

	private EmployeeService employeeService;
	
	Logger log=LoggerFactory.getLogger(EmployeeResource.class);

	@Autowired
	public EmployeeResource(EmployeeService service) {
		this.employeeService = service;
	}
	
	
	@RequestMapping(value="/employeeservice/name/{name}",method=RequestMethod.GET)
	public List<Employee> test(@PathVariable String name) {
		List<Employee> employees = employeeService.findEmployeeByName(name);
		return employees;		
	}
	
	@RequestMapping(value="/save",method=RequestMethod.PUT)
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public List<Employee> getAllEmployees() {
		log.info("The method execution has started:"+this.getClass().getName());
		return employeeService.getAllEmployees();
	}
	
	@RequestMapping(value="/getById/{Id}",method=RequestMethod.GET)
	public Employee getEmployeeById(@PathVariable int Id) {
		return employeeService.findEmployeeById(Id);
	}
	
	@RequestMapping(value="/getByName/{Name}",method=RequestMethod.GET)
	public List<Employee> getEmployeeByName(@PathVariable String Name) {
		return employeeService.findEmployeeByName(Name);
	}
	
	@RequestMapping(value="/getByNameAndAge/{Name}/{Age}",method=RequestMethod.GET)
	public List<Employee> getEmployeeByNameAndAge(@PathVariable String Name,@PathVariable int Age) {
		return employeeService.findEmployeeByNameAndAge(Name, Age);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public boolean updateEmployees(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	
	
	
	
	

}

