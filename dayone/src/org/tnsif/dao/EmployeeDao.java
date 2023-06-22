package org.tnsif.dao;

import org.tnsif.entities.emplyee;

public interface EmployeeDao {
	//by default abstract
	//user defined method for crud operation
	 void addEmployee(emplyee emp);//crete
	 emplyee getEmploye(int id);//retrive
	 void removeStudent(emplyee emp);
	 void updateEmployee (emplyee emp);//update
	 void deleteEmployee(emplyee emp);//delete
	 
	 //jpa transation
	 void beginTransaction();//begin
	 void commitTransaction();//close

}
