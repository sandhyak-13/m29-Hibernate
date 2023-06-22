//driver class
package org.tnsif.client;

import org.tnsif.entities.emplyee;
import org.tnsif.sevice.Employeeserviceimpl;
import org.tnsif.sevice.EmplyeeServices;

public class Client {

	public static void main(String[] args) {
		EmplyeeServices  service =new Employeeserviceimpl ();
		emplyee emp  =new emplyee();
		//crate
	
		emp.setId(102);
		emp.setName("sandhya kahmagl");
		service.createEmployee(emp);
		System.out.println("data add ");
	
		
		//update 
		/*
		 * emp=service.getEmploye(101);
		emp.setName("sachin k");
		service.updateEmployee(emp);
		System.out.println("data update ");
		*/
		
		//delete
		/*
		emp =service.getEmploye(102);
		service.removeStudent(emp);
		System.out.println("data delete ");
		
		
		
		
		
		//retriev
		emp=service.getEmploye(102);
		System.out.println("emp id "+emp.getId());
		System.out.println("emp name "+emp.getName());
		
		*/
	}

}
