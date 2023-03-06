package com.example.tp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class E_CategoriecoursePK implements Serializable {
    private int idCourse;
    private int idCategorie;

    @Column(name = "idCourse", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    @Column(name = "idCategorie", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(int idCategorie) {
        this.idCategorie = idCategorie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_CategoriecoursePK that = (E_CategoriecoursePK) o;

        if (idCourse != that.idCourse) return false;
        if (idCategorie != that.idCategorie) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCourse;
        result = 31 * result + idCategorie;
        return result;
    }
}
