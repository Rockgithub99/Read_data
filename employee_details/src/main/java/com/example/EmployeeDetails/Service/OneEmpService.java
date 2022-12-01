package com.example.EmployeeDetails.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDetails.Entity.Employee;
import com.example.EmployeeDetails.Repository.EmpRepo;
@Service("OneEmp")
public class OneEmpService implements EmployeeImp {

	@Autowired
	EmpRepo empRepo;

	
	@Override
	public List <Employee> getFindAll() {
		List<Employee> em2=(List<Employee>) empRepo.findAll();
		return em2;
	}

	
	@Override
	public String getFindById(String id) {
		Optional<Employee> var2=empRepo.findById(id);
		return "Return the Employee one Id :" + id;
	}

	public String getMessage() {
		String st="One employee service is  print";
		return st;
	}


	@Override
	public List <Employee> getFindBYName() {
	Iterable<Employee> em2=empRepo.findAll();
		return (List<Employee>) em2;
	}


	

	
}
