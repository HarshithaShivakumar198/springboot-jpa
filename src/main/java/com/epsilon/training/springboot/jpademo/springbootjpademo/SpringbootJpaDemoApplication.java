package com.epsilon.training.springboot.jpademo.springbootjpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epsilon.training.springboot.jpademo.springbootjpademo.model.Employee;
import com.epsilon.training.springboot.jpademo.springbootjpademo.service.EmployeeService;

@SpringBootApplication
public class SpringbootJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee emp1 = null;
		Employee emp2 = null;
		Employee emp3 = null;
		try {
			emp1 = new Employee(1, "Harshitha", 100000, 24, "Female");
			emp2 = new Employee(2, "Hariom", 100001, 24, "Male");
			emp3 = new Employee(3, "Akshay", 100002, 24, "Male");

			employeeService.save(emp1);
			employeeService.save(emp2);
			employeeService.save(emp3);

			/*
			 * List<Employee> empList = employeeService.getAllEmployees();
			 * 
			 * List<Employee> empNameList =
			 * employeeService.findEmployeeByNameAndAge("Hariom", 24);
			 * 
			 * emp3.setAge(22); boolean update_status =
			 * employeeService.updateEmployee(emp3); System.out.println(update_status);
			 * 
			 * boolean delete_status = employeeService.deleteEmployee("Akshay");
			 * System.out.println(delete_status);
			 */
			

		} catch (Exception e) {
			System.out.println(e.getCause());
		} finally {

		}

		
	}

}
