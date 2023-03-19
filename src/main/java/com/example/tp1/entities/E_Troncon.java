package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "troncon", schema = "bdd2i_test", catalog = "")
public class E_Troncon {
    private int id;
    private Integer pointDepart;
    private Integer pointArrivee;
    private Integer numeroCourse;
    private Integer tempsMax;
    private Date dateMax;
    private Integer tempsAlerte;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "pointDepart", nullable = true)
    public Integer getPointDepart() {
        return pointDepart;
    }

    public void setPointDepart(Integer pointDepart) {
        this.pointDepart = pointDepart;
    }

    @Basic
    @Column(name = "pointArrivee", nullable = true)
    public Integer getPointArrivee() {
        return pointArrivee;
    }

    public void setPointArrivee(Integer pointArrivee) {
        this.pointArrivee = pointArrivee;
    }

    @Basic
    @Column(name = "numeroCourse", nullable = true)
    public Integer getNumeroCourse() {
        return numeroCourse;
    }

    public void setNumeroCourse(Integer numeroCourse) {
        this.numeroCourse = numeroCourse;
    }

    @Basic
    @Column(name = "tempsMax", nullable = true)
    public Integer getTempsMax() {
        return tempsMax;
    }

    public void setTempsMax(Integer tempsMax) {
        this.tempsMax = tempsMax;
    }

    @Basic
    @Column(name = "dateMax", nullable = true)
    public Date getDateMax() {
        return dateMax;
    }

    public void setDateMax(Date dateMax) {
        this.dateMax = dateMax;
    }

    @Basic
    @Column(name = "tempsAlerte", nullable = true)
    public Integer getTempsAlerte() {
        return tempsAlerte;
    }

    public void setTempsAlerte(Integer tempsAlerte) {
        this.tempsAlerte = tempsAlerte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Troncon eTroncon = (E_Troncon) o;

        if (id != eTroncon.id) return false;
        if (pointDepart != null ? !pointDepart.equals(eTroncon.pointDepart) : eTroncon.pointDepart != null)
            return false;
        if (pointArrivee != null ? !pointArrivee.equals(eTroncon.pointArrivee) : eTroncon.pointArrivee != null)
            return false;
        if (numeroCourse != null ? !numeroCourse.equals(eTroncon.numeroCourse) : eTroncon.numeroCourse != null)
            return false;
        if (tempsMax != null ? !tempsMax.equals(eTroncon.tempsMax) : eTroncon.tempsMax != null) return false;
        if (dateMax != null ? !dateMax.equals(eTroncon.dateMax) : eTroncon.dateMax != null) return false;
        if (tempsAlerte != null ? !tempsAlerte.equals(eTroncon.tempsAlerte) : eTroncon.tempsAlerte != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (pointDepart != null ? pointDepart.hashCode() : 0);
        result = 31 * result + (pointArrivee != null ? pointArrivee.hashCode() : 0);
        result = 31 * result + (numeroCourse != null ? numeroCourse.hashCode() : 0);
        result = 31 * result + (tempsMax != null ? tempsMax.hashCode() : 0);
        result = 31 * result + (dateMax != null ? dateMax.hashCode() : 0);
        result = 31 * result + (tempsAlerte != null ? tempsAlerte.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Troncon{" +
                "id=" + id +
                ", pointDepart=" + pointDepart +
                ", pointArrivee=" + pointArrivee +
                ", numeroCourse=" + numeroCourse +
                ", tempsMax=" + tempsMax +
                ", dateMax=" + dateMax +
                ", tempsAlerte=" + tempsAlerte +
                '}';
    }
}
