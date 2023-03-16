package com.example.tp1;
//Import

import com.example.tp1.entities.E_Coureur;
import com.example.tp1.entities.E_Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ParseException {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
            entityManager = entityManagerFactory.createEntityManager();

            System.out.println("------------------------------------");

            E_Course course = entityManager.find(E_Course.class,1);
            System.out.println(course);
        } finally {
            if (entityManager != null) entityManager.close();
            if (entityManagerFactory != null) entityManagerFactory.close();
        }

    }
}
