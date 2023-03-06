package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tronconcourse", schema = "bdd2i_test", catalog = "")
@IdClass(E_TronconcoursePK.class)
public class E_Tronconcourse {
    private int idCourse;
    private int idTroncon;

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
    @Column(name = "idTroncon", nullable = false)
    public int getIdTroncon() {
        return idTroncon;
    }

    public void setIdTroncon(int idTroncon) {
        this.idTroncon = idTroncon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Tronconcourse that = (E_Tronconcourse) o;

        if (idCourse != that.idCourse) return false;
        if (idTroncon != that.idTroncon) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCourse;
        result = 31 * result + idTroncon;
        return result;
    }
}
