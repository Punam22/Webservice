package com.rest.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.model.Employee;
import com.rest.services.EmployeeServices;

@Path("/update")
public class Update {

	EmployeeServices service = new EmployeeServices(); 
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String updateEmployee(@PathParam("id") int id,Employee employee) {
		service.updateEmployee(id,employee);
		return "success";
	}
}
