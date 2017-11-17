package com.vitorog.etl;

import com.vitorog.etl.domain.Issue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAHelloWorld {

    public static void main(String[] args){
        // Hello World! - For testing purposes
        EntityManagerFactory sessionFactory = Persistence.createEntityManagerFactory( "com.vitorog.etl" );

        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(new Issue("System crashing when clicking on button."));
        entityManager.getTransaction().commit();
        entityManager.close();

        sessionFactory.close();
    }
}
