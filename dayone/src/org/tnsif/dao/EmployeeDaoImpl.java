package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.emplyee;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager em;
	//default constructor 
	public EmployeeDaoImpl() {
		em =JPUtil.getEntityManager();
		}
//crete and add 
	@Override
	public void addEmployee(emplyee emp) {
		em.persist(emp);
		
		
	}

	//reterive
	@Override
	public emplyee getEmploye(int id) {
		emplyee emp=em.find(emplyee.class, id);
		return emp;
	}

	@Override
	public void updateEmployee(emplyee emp) {
		em.merge(emp);
		
	}

	@Override
	public void deleteEmployee(emplyee emp) {
		em.remove(emp);
		
	}

	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}
	@Override
	public void removeStudent(emplyee emp) {
		em.remove(emp);
		
	}

}
