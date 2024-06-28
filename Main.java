package org.example.JPABillet;

import org.example.JPABillet.Entity.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {



    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPABillet");
        EntityManager em = emf.createEntityManager();

          Client client = Client.builder()
                .nom("Ben")
                .prenom("prenomSaisie")
                .age(52)
                .build();

          em.getTransaction().begin();
          em.persist(client);
          em.getTransaction().commit();




    }



}



