package com.example.EmployeeDetails.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.EmployeeDetails.Entity.Employee;



@Service 
public interface EmployeeImp {

	public String getFindById(String id);
	
	public String getMessage();
	
	public List<Employee> getFindAll();

	
	public List< Employee> getFindBYName();


}
