package com.rest.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.Employee;
import com.rest.services.EmployeeServices;

@Path("/create")
public class Create {
	
	EmployeeServices service = new EmployeeServices(); 
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
	public String createEmployee(Employee employee) {
    	service.createEmployee(employee);
    	return "success"; 
    }
}
  