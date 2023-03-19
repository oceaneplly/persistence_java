package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categoriecourse", schema = "bdd2i_test", catalog = "")
@IdClass(E_CategoriecoursePK.class)
public class E_Categoriecourse {
    private int idCourse;
    private int idCategorie;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCourse", nullable = false)
    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCategorie", nullable = false)
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

        E_Categoriecourse that = (E_Categoriecourse) o;

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

    @Override
    public String toString() {
        return "E_Categoriecourse{" +
                "idCourse=" + idCourse +
                ", idCategorie=" + idCategorie +
                '}';
    }
}
