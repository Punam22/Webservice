package com.rest.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.Employee;
import com.rest.services.EmployeeServices;

@Path("/read")
public class Read {

	EmployeeServices service = new EmployeeServices(); 
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> readEmployees() {
		return service.getAllEmployee();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee readEmployee(@PathParam("id") int id) {
		return service.getEmployee(id);
	}
}
