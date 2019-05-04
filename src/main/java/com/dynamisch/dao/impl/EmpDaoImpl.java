package com.dynamisch.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dynamisch.dao.EmpDao;
import com.dynamisch.model.Employee;

@Repository
@Transactional
public class EmpDaoImpl implements EmpDao{
	
	@Autowired
	SessionFactory sessionFactory;
	
	protected Session currentSession() {
		return sessionFactory.getCurrentSession();
		
	}

	public Employee create(Employee emp) {
		// TODO Auto-generated method stub
		currentSession().save(emp);
		return emp;
	}

	public Employee update(Employee emp) {
		// TODO Auto-generated method stub
		currentSession().update(emp);
		return emp;
	}

	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		currentSession().delete(emp);
	}

	public Employee find(int id) {
		// TODO Auto-generated method stub
		return (Employee) currentSession().get(Employee.class, id);
	}

	public Employee edit(int id) {
		// TODO Auto-generated method stub
		return find(id);
	}

	@SuppressWarnings("unchecked")
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return currentSession().createCriteria(Employee.class).list();
	}

}
