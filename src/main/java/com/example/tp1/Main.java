package com.example.tp1;
//Import

import com.example.tp1.entities.E_Competition;
import com.example.tp1.entities.E_Coureur;
import com.example.tp1.entities.E_Course;
import jakarta.persistence.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

            E_Competition competition = entityManager.find(E_Competition.class, 1);

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
            System.out.println("Question n°1 \n");
            System.out.println("Nombre de kilomètres : " + getDistanceComp(entityManager, 1));
            System.out.println("Question n°2 \n");
            System.out.println("Hashtag: " + getHashtagValue(entityManager, "pomme"));
            System.out.println("Question n°3 \n");

            final String strQuery = "UPDATE E_Course e "
                    + "SET e.etatCourse = 'Terminé' " + "WHERE e.etatCourse = :etatCourse";
            Query query = entityManager.createQuery(strQuery);
            query.setParameter("etatCourse", "En cours");
            final EntityTransaction et = entityManager.getTransaction();
            try {
                et.begin();
                query.executeUpdate();
                et.commit();
            } catch (Exception ex) {
                et.rollback();
            }
            System.out.println("Question n°4 \n");
            List<String> distanceR = getDistanceRunners(entityManager);
        } finally {
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

    private static List<String> getHashtagValue(EntityManager entityManager, String hashtag) {
        final String strQuery = "SELECT e FROM E_Commentaire e WHERE e.hashtag = :hashtag";
        Query query = entityManager.createQuery(strQuery);
        query.setParameter("hashtag", hashtag);
        List<String> results = query.getResultList();
        return results;
    }

    private static List<String> getDistanceRunners(EntityManager entityManager) {
        final String strQuery = "SELECT coureur.id, sum(course.distance)\n" +
                "FROM E_Course as course\n" +
                "JOIN E_Inscription as inscr ON course.id = inscr.idCourse\n" +
                "JOIN E_Coureur as coureur ON inscr.idCoureur = coureur.id\n" +
                "GROUP BY coureur.id\n" +
                "ORDER BY coureur.id ASC";
        Query query = entityManager.createQuery(strQuery);
        List<String> results = query.getResultList();
        return results;
    }
}

