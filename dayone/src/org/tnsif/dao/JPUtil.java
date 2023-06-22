package org.tnsif.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPUtil {
	
	private static EntityManagerFactory factory;
	private static EntityManager em;
	//Entity MAnager crud method 
	//create ->persist(obj);
	//retrive->find(pk);
	//update ->merge(obj);
	//delete ->remove(pk);
	
	static 
	{
		factory =Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager()
	{
		if(em==null || !em.isOpen())
		{
			em=factory.createEntityManager();
		}
		return em;
	}
	

}
