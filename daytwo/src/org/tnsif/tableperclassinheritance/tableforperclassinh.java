package org.tnsif.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class tableforperclassinh {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		Citizen c=new Citizen();
		c.setAdharno(411545112555L);
		c.setCity("pune");
		c.setArea("vima nagr");
		em.persist(c);
		
		Citizen c1=new Citizen();
		c1.setAdharno(411545112555L);
		c1.setCity("mumbbai");
		c1.setArea("bandra nagr");
		em.persist(c);
		
		
		em.getTransaction().commit();
		System.out.println("aded succfully");
		em.close();
		factory.close();

	}

}
