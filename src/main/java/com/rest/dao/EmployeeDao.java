package com.rest.dao;

import java.util.List;

import org.hibernate.Session;

import com.rest.model.Employee;

public class EmployeeDao {
	
	public List<Employee> getAllEmployee(Session session) {
		session.beginTransaction();
		@SuppressWarnings("unchecked")
		List<Employee> list = session.createQuery("from Employee").getResultList();
		session.getTransaction().commit();
		return list;
	}
	
	public Employee getEmployee(int id,Session session) {
		session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		session.getTransaction().commit();
		return emp;
	}
	
	public void createEmployee(Employee employee,Session session) {
		session.beginTransaction();
		session.save(employee);
		session.getTransaction().commit();
	}

	public void updateEmployee(int id,Session session,Employee employee) {
		session.beginTransaction();
		employee.setId(id);
		session.merge(employee);
		session.getTransaction().commit();
	}

	public void deleteEmployee(int id, Session session) {
		session.beginTransaction();
		Employee emp = session.get(Employee.class, id);
		session.delete(emp);
		session.getTransaction().commit();
	}
}
