package com.rest.webservice;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.rest.services.EmployeeServices;

@Path("/delete")
public class Delete {

	EmployeeServices service = new EmployeeServices(); 
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteEmployee(@PathParam("id") int id) {
		service.deleteEmployee(id);
		return "success";
	}
}
