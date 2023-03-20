package com.example.tp1.jpaDao;

import com.example.tp1.entities.E_Competition;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("default");
            entityManager = entityManagerFactory.createEntityManager();

            JpaDaoCompetition competition = JpaDaoCompetition.getInstance(entityManager);

            /* Test n°1
            // find competition
            E_Competition c1 = (E_Competition) competition.find(E_Competition.class, 5);
            System.out.println(c1);

            Date dateDebut = new Date(2022,07,01,14,0,0);
            Date dateFin = new Date(2022,07,01,17,0,0);
            Timestamp timestampDebut = new Timestamp(dateDebut.getTime());
            Timestamp timestampFin = new Timestamp(dateFin.getTime());

            // create competition
            E_Competition c2 = new E_Competition("Test création effacé",timestampDebut,timestampFin,"Béthune",1);
            competition.create(c2);
    */
            E_Competition c3 = (E_Competition) competition.find(4);
            if (c3 != null) {
                System.out.println("Une Autre Competition (4) : " + c3.toString());
                c3.setAdressePc("Paris");
                competition.update(c3);
                System.out.println("Une Autre Competition (4) après le changement de l'année: " + c3.toString());
            }
            else {
                System.out.println("La competition recherchée n'existe pas");
            }

            /*
            System.out.println("Test suppression \n");
            E_Competition c4 = (E_Competition) competition.find(7);
            competition.delete(c4);
            */

            Date dateDebut = new Date(2022,07,01,14,0,0);
            Date dateFin = new Date(2022,07,01,17,0,0);
            Timestamp timestampDebut = new Timestamp(dateDebut.getTime());
            Timestamp timestampFin = new Timestamp(dateFin.getTime());

            E_Competition maCompetition = new E_Competition();
            maCompetition.setAdressePc("Paris tqt");
            maCompetition.setIdClient(c3.getIdClient());
            maCompetition.setNom("Competition Test");
            maCompetition.setDateDebut(timestampDebut);
            maCompetition.setDateFin(timestampFin);

            competition.create(maCompetition);
            System.out.println(competition.findAll(E_Competition.class).size());
        }  finally {
            if (entityManager != null) entityManager.close();
            if (entityManagerFactory != null) entityManagerFactory.close();
        }
        }
}
