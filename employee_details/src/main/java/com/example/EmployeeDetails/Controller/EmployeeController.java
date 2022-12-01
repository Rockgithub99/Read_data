package com.example.EmployeeDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDetails.Entity.Employee;
import com.example.EmployeeDetails.Service.EmployeeImp;


@RestController
@RequestMapping("/Employee")
public class EmployeeController {

	@Autowired
	@Qualifier("OneEmp")
	EmployeeImp employeeImp;

	@GetMapping("/getAll")
	public List<Employee> getAllEmp() {
		List<Employee> emp = employeeImp.getFindAll();
		return emp;

	}
	

	@GetMapping("/getEmp/{id}")
	public String getEmp(@RequestParam("emp_id") String id) {
		String emp = employeeImp.getFindById(id);

		return emp;

	}

	@GetMapping("/getMessage")
	public String getAllMessage() {
		String out = employeeImp.getMessage();
		return out;

	}

	
	
	
	@GetMapping("/getfind/{name}")
	public List<Employee> getFindEmp(@PathVariable  String name) {
		 List<Employee> empl=employeeImp.getFindBYName();
		return empl;
		
	}
	
	
	
	
	@GetMapping("/getUser")

	public String getUser(@RequestParam("user_name") String name) {
		return "My name is " + name;
		
	}
	
	
	@Value("${emp.id}")
	private String empId;
	@Value("${emp.name}")
	private String empName;
	@Value("${emp.dep}")
	private String empDep;
	
	
	@GetMapping("/getName")
	public  String getEmployee() {
		return "Employee details \n:"+empId + empName + empDep;
		
	}
	
	
}
