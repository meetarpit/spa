package com.dynamisch.service;

import java.util.List;

import com.dynamisch.model.Employee;

public interface EmpService {

	public Employee create(Employee emp);
	public Employee update(Employee emp);
	public void delete(Employee emp);
	public Employee find(int id);
	public Employee edit(int id);
	public List<Employee> getAll();
}
