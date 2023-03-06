package com.example.tp1;
//Import
import com.example.tp1.entities.E_Coureur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Main {
    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

    public static void main(String[] args) {
        final EntityManager entityManager = getEntityManager();
        // Recherche d'un coureur
        EntityTransaction transaction = null;
        transaction = entityManager.getTransaction();

        E_Coureur unAutreCoureur = new E_Coureur("Pouilly", "Océane");

        try {
            transaction.begin();
            entityManager.persist(unAutreCoureur);
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        } finally {
            entityManager.close();
        }
    }
}
