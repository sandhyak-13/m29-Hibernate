package org.tnsif.sevice;

import org.tnsif.entities.emplyee;

public interface EmplyeeServices {
	
	void createEmployee(emplyee emp);//crete
	 emplyee getEmploye(int id);//retrive
	 void removeStudent(emplyee emp);
	 void updateEmployee (emplyee emp);//update
	 void deleteEmployee(emplyee emp);//delete

}
