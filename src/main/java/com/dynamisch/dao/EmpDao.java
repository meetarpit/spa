package com.dynamisch.dao;

import java.util.List;

import com.dynamisch.model.Employee;

public interface EmpDao {
	
	public Employee create(Employee emp);
	public Employee update(Employee emp);
	public void delete(Employee emp);
	public Employee find(int id);
	public Employee edit(int id);
	public List<Employee> getAll();

}