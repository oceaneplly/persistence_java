package com.example.tp1;
//Import

import com.example.tp1.Service.CoureurService;
import com.example.tp1.entities.E_Coureur;
import com.example.tp1.entities.E_Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Random;

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

        EntityTransaction transaction;
        transaction = entityManager.getTransaction();

        CoureurService coureurService = new CoureurService(entityManager);

        Random number = new Random();
        int randomNumber = number.nextInt(((100 - 1) + 1) + 1);
        E_Coureur coureur = coureurService.findCoureurById(randomNumber);

        if (null != coureur) {
            System.out.println(coureur);
        } else {
            System.out.println("Coureur not found");
        }

        coureurService.deleteCoureur(randomNumber);

        E_Course testCourse;
        testCourse = entityManager.find(E_Course.class,1);
//        testCourse.getCompetition();
        System.out.println(testCourse.toString());

        try {
          transaction.begin();
//            coureurService.createCoureur("tomdanion@gmail.fr","password","7 rue des Lilas Lomme","0789314569","1674","Danion","Tom","M", "2000-06-20","hors_course");
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
