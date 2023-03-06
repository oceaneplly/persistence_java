package com.example.tp1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class E_TronconcoursePK implements Serializable {
    private int idCourse;
    private int idTroncon;

    @Column(name = "idCourse", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    @Column(name = "idTroncon", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

        E_TronconcoursePK that = (E_TronconcoursePK) o;

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
