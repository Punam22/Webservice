package com.rest.services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.rest.dao.EmployeeDao;
import com.rest.model.Employee;

public class EmployeeServices {
	
	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	EmployeeDao dao = new EmployeeDao();
	
	public List<Employee> getAllEmployee() {
		Session session = factory.getCurrentSession();
		return dao.getAllEmployee(session);
	} 
	
	public Employee getEmployee(int id) {
		Session session = factory.getCurrentSession();
		return dao.getEmployee(id, session);
	}
	
	public void createEmployee(Employee employee) {
		Session session = factory.getCurrentSession();
		dao.createEmployee(employee, session);
	}
	
	public void updateEmployee(int id,Employee employee) {
		Session session = factory.getCurrentSession();
		dao.updateEmployee(id,session,employee);
	}
	
	public void deleteEmployee(int id) {
		Session session = factory.getCurrentSession();
		dao.deleteEmployee(id,session);
	}
}
