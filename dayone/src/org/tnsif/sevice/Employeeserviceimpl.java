package org.tnsif.sevice;

import org.tnsif.dao.EmployeeDao;
import org.tnsif.dao.EmployeeDaoImpl;
import org.tnsif.entities.emplyee;

public class Employeeserviceimpl  implements EmplyeeServices{

	private EmployeeDao dao;
	
	public Employeeserviceimpl() {
		dao =new EmployeeDaoImpl();
	}

	@Override
	public void createEmployee(emplyee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public emplyee getEmploye(int id) {
		emplyee emp =dao.getEmploye(id);
		return emp;
	}

	@Override
	public void updateEmployee(emplyee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void deleteEmployee(emplyee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
		
	}

	@Override
	public void removeStudent(emplyee emp) {
		dao.beginTransaction();
		dao.removeStudent(emp);
		dao.commitTransaction();
		
	}

}
