package com.example.tp1.Service;

import com.example.tp1.entities.E_Coureur;
import jakarta.persistence.EntityManager;

import java.sql.Date;

public class CoureurService {
    private EntityManager entityManager;

    public CoureurService(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    public E_Coureur findCoureurById(int id)
    {
        return this.entityManager.find(E_Coureur.class, id);
    }

    public void createCoureur(
            String email,
            String password,
            String address,
            String phoneNumber,
            String licenceNumber,
            String lName,
            String fName,
            String sex,
            String birth,
            String etat
    )
    {
        Date birthDate = Date.valueOf(birth);//converting string into sql date

        E_Coureur coureur = new E_Coureur(email, password, address, phoneNumber, licenceNumber, lName, fName, sex, birthDate, etat);
        this.entityManager.persist(coureur);
    }

    public void updateCoureur(int id, String field, String updatedValue)
    {
        if (null != this.findCoureurById(id)) {
            E_Coureur coureur = this.findCoureurById(id);
        }
        System.out.println("Coureur not found with ID " + id);
    }

    public void deleteCoureur(int id)
    {
        if (null != this.findCoureurById(id))
        {
            E_Coureur coureur = this.findCoureurById(id);
            this.entityManager.remove(coureur);
            System.out.println("Sucessfully deleted");
            return;
        }
        System.out.println("Coureur not found with ID " + id);
    }
}
