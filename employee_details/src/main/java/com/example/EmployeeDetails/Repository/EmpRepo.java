package com.example.EmployeeDetails.Repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeDetails.Entity.Employee;
@Repository
public interface EmpRepo  extends CrudRepository<Employee, String>{

	Optional<Employee> findById(Optional<Employee> findBYName);

}
