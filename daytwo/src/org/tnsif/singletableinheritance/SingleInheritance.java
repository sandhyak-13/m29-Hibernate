package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleInheritance {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create employee 
		Employee emp1 =new Employee();
		emp1.setEmpname("sandhya");
		emp1.setEmpid(101);
		emp1.setSalary(204.0f);
		em.persist(emp1);
		
		Manager m=new Manager();
		m.setEmpname("sak");
		m.setDepname("hr");
		em.persist(m);
		
		em.getTransaction().commit();
		
		System.out.println("aded succfully");
		em.close();
		factory.close();
	}

}
