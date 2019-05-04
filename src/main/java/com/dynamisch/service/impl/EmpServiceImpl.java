package com.dynamisch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dynamisch.dao.EmpDao;
import com.dynamisch.model.Employee;
import com.dynamisch.service.EmpService;

@Service
@Transactional
public class EmpServiceImpl implements EmpService{
	
	@Autowired
	EmpDao empDao;

	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		empDao.create(emp);
		return emp;
		
	}

	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		empDao.update(emp);
		return emp;
	}

	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		empDao.delete(emp);
	}

	public Employee find(int id) {
		// TODO Auto-generated method stub
		return empDao.find(id);
	}

	public Employee edit(int id) {
		// TODO Auto-generated method stub
		return empDao.edit(id);
	}

	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return empDao.getAll();
	}

}
