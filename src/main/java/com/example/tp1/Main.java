package com.example.tp1;
//Import

import com.example.tp1.entities.E_Competition;
import com.example.tp1.entities.E_Coureur;
import com.example.tp1.entities.E_Course;
import jakarta.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Arrays;

import static java.lang.Thread.getAllStackTraces;
import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args) throws ParseException {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
            entityManager = entityManagerFactory.createEntityManager();

            System.out.println("--------------- TP1 --------------------- \n");

          //  E_Course course = entityManager.find(E_Course.class,1);
          //  System.out.println(course);

            E_Competition competition = entityManager.find(E_Competition.class,1);

            // Affichage de la liste des courses
             System.out.println(competition.getCourses());

            // Affichage 1
            System.out.println("Avant modification");
            System.out.println(competition.toString());

           // sleep(7000); // Le temps de faire la modification en BDD
            entityManager.refresh(competition); // rafraîchir les rôles

            // Affichage 2
            System.out.println("Après modification");
            System.out.println(competition.toString());

            System.out.println("--------------------------------------------- \n");
            System.out.println("--------------- TP2 --------------------- \n");
            System.out.println("Nombre de kilomètres : "+getDistanceComp(entityManager,1));


            //     System.out.println(competition);
        }  finally {
            if (entityManager != null) entityManager.close();
            if (entityManagerFactory != null) entityManagerFactory.close();
        }

    }

    private static double getDistanceComp(EntityManager entityManager, int idComp) {
        final String strQuery = "SELECT SUM (e.distance) FROM E_Course e WHERE e.competition.id = :idComp";
        Query query = entityManager.createQuery(strQuery);
        query.setParameter("idComp", idComp);
        double distance = (double) query.getSingleResult();
        return distance;
    }
}

