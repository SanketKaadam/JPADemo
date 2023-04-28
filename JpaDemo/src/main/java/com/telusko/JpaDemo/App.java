package com.telusko.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager em = emf.createEntityManager();
        
        Alien a = em.find(Alien.class, 4);
    }
}
