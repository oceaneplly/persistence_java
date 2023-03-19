package com.example.tp1.Service;

import com.example.tp1.entities.E_Categorie;
import com.example.tp1.entities.E_Coureur;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.Collection;
import java.util.List;

public class CoureurPerCategorieProvider
{
    private EntityManager entityManager;

    public CoureurPerCategorieProvider(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }
    public long getCoureursFromCategorie(E_Categorie categorie)
    {
        final String strQuery = "SELECT count(i.idCoureur) FROM E_Inscription i WHERE i.codeCategorie = :idCateg";
        Query query  = this.entityManager.createQuery(strQuery);
        query.setParameter("idCateg", categorie.getId());
        return (long) query.getSingleResult();
    }
}
