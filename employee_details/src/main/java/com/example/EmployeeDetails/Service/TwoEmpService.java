package com.example.EmployeeDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDetails.Entity.Employee;
import com.example.EmployeeDetails.Repository.EmpRepo;

@Service("TwoEmp")
public class TwoEmpService implements EmployeeImp {

	@Autowired
	EmpRepo empRepo;
	
	
	@Override
	public List<Employee> getFindAll() {
		 List <Employee> em=(List<Employee>) empRepo.findAll();
		return em;
	}

	@Override
	public String getFindById(String id) {
		Optional<Employee> var = empRepo.findById(id);
		return "Return the Employee two id :" + id;
	}
	
	

	public String getMessage() {
		String st1="Two employee Service is Print";
		return st1;
	}

	@Override
	public List<Employee> getFindBYName() {
		Iterable<Employee> emp=empRepo.findAll();
		return (List<Employee>) emp;
	}

	



	
	
	
	
	

}
