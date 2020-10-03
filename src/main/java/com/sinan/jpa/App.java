package com.sinan.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sinan.jpa.pojo.User;

/**
 * Sinan Karakaya
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	EntityManagerFactory emf;
    	EntityManager em;
    	
    	User user = new User();
    	user.setUserPK(1);
    	user.setUserName("sinan");
    	user.setUserSurname("karakaya");
    	
    	emf = Persistence.createEntityManagerFactory("PU_Ayar");
    	em = emf.createEntityManager();
    	
    	em.getTransaction().begin();
    		em.persist(user);
    	em.getTransaction().commit();
    	
    	System.out.println("ID : "+user.getUserPK()+"\n"+
    					   "Username : "+user.getUserName()+"\n"+
    					   "Surname : "+user.getUserSurname());
    	em.close();
    	emf.close();
    }
}
