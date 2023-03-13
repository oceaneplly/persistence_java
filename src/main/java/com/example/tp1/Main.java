package com.example.tp1;
//Import

import com.example.tp1.entities.E_Coureur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

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

    public static void main(String[] args) throws ParseException {
        final EntityManager entityManager = getEntityManager();
        // Recherche d'un coureur
        EntityTransaction transaction = null;
        transaction = entityManager.getTransaction();

        // Ajout coureur short
        E_Coureur unAutreCoureur = new E_Coureur("Pouilly", "Océane");

        // Ajout coureur long
        String str="2000-06-20";
        Date date=Date.valueOf(str);//converting string into sql date
        E_Coureur unCoureurEncore = new E_Coureur("tomdanion@gmail.fr","password","7 rue des Lilas Lomme","0789314569","1674","Danion","Tom","M", date,"hors_course");
        try {
            transaction.begin();
            entityManager.persist(unCoureurEncore);
            transaction.commit();
        } catch (Exception ex) {
            ex.printStackTrace();

            if (transaction != null) {
                transaction.rollback();
            }
            throw ex;
        }

        // Modifications dans la BDD avec un id
        E_Coureur X = entityManager.find(E_Coureur.class,1002);
        if (X == null)
        {
            System.out.println("Le coureur X=1002 n'existe pas");
        }
        else {
            transaction.begin();
            X.setEtatCoureur("en_course");
            X.setTel("067842135");
            entityManager.persist(X);
            transaction.commit();
        }

        // Suppression dans la BDD
        E_Coureur coureurSupp = entityManager.find(E_Coureur.class,1003);
        if (coureurSupp == null)
        {
            System.out.println("Le coureur X=1003 n'existe pas");
        }
        else {
            transaction.begin();
            entityManager.remove(coureurSupp);
            transaction.commit();
        }
        entityManager.close();

    }
}
