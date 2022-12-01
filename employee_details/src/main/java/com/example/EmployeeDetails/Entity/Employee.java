package com.example.EmployeeDetails.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Value;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Employee {
	@Id
	@Value("${emp.id}")
	private String id;
	@Value("${emp.name}")
	private String name;
	@Value("${emp.dep}")
	private String department;
	
	
	
	
	
	
}
