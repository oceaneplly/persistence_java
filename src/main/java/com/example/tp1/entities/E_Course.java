package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "course", schema = "bdd2i_test", catalog = "")
public class E_Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private Time heureDepart;
    private Time horaireMax;
    private Double distance;
    private Integer duree;
    private Integer lieuDepart;
    private Integer lieuArrivee;
    private Object nature;

    @ManyToOne(optional = false) @JoinColumn(name = "idCompetition")
    private E_Competition competition;

    public E_Competition getCompetition() {
        return competition;
    }

    public void setCompetition(E_Competition competition) {
        this.competition = competition;
    }

    public E_Course() {
    }

    public E_Course(int id) {
        this.id = id;
    }

    public E_Course(int id, String nom, Time heureDepart, Time horaireMax, Double distance, Integer duree, Integer lieuDepart, Integer lieuArrivee, Object nature) {
        this.id = id;
        this.nom = nom;
        this.heureDepart = heureDepart;
        this.horaireMax = horaireMax;
        this.distance = distance;
        this.duree = duree;
        this.lieuDepart = lieuDepart;
        this.lieuArrivee = lieuArrivee;
        this.nature = nature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom", nullable = true, length = 255)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "heureDepart", nullable = true)
    public Time getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(Time heureDepart) {
        this.heureDepart = heureDepart;
    }

    @Basic
    @Column(name = "horaireMax", nullable = true)
    public Time getHoraireMax() {
        return horaireMax;
    }

    public void setHoraireMax(Time horaireMax) {
        this.horaireMax = horaireMax;
    }

    @Basic
    @Column(name = "distance", nullable = true, precision = 0)
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @Basic
    @Column(name = "duree", nullable = true)
    public Integer getDuree() {
        return duree;
    }

    public void setDuree(Integer duree) {
        this.duree = duree;
    }

    @Basic
    @Column(name = "lieuDepart", nullable = true)
    public Integer getLieuDepart() {
        return lieuDepart;
    }

    public void setLieuDepart(Integer lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    @Basic
    @Column(name = "lieuArrivee", nullable = true)
    public Integer getLieuArrivee() {
        return lieuArrivee;
    }

    public void setLieuArrivee(Integer lieuArrivee) {
        this.lieuArrivee = lieuArrivee;
    }

    @Basic
    @Column(name = "nature", nullable = true)
    public Object getNature() {
        return nature;
    }

    public void setNature(Object nature) {
        this.nature = nature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Course eCourse = (E_Course) o;

        if (id != eCourse.id) return false;
        if (nom != null ? !nom.equals(eCourse.nom) : eCourse.nom != null) return false;
        if (heureDepart != null ? !heureDepart.equals(eCourse.heureDepart) : eCourse.heureDepart != null) return false;
        if (horaireMax != null ? !horaireMax.equals(eCourse.horaireMax) : eCourse.horaireMax != null) return false;
        if (distance != null ? !distance.equals(eCourse.distance) : eCourse.distance != null) return false;
        if (duree != null ? !duree.equals(eCourse.duree) : eCourse.duree != null) return false;
        if (lieuDepart != null ? !lieuDepart.equals(eCourse.lieuDepart) : eCourse.lieuDepart != null) return false;
        if (lieuArrivee != null ? !lieuArrivee.equals(eCourse.lieuArrivee) : eCourse.lieuArrivee != null) return false;
        if (nature != null ? !nature.equals(eCourse.nature) : eCourse.nature != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (heureDepart != null ? heureDepart.hashCode() : 0);
        result = 31 * result + (horaireMax != null ? horaireMax.hashCode() : 0);
        result = 31 * result + (distance != null ? distance.hashCode() : 0);
        result = 31 * result + (duree != null ? duree.hashCode() : 0);
        result = 31 * result + (lieuDepart != null ? lieuDepart.hashCode() : 0);
        result = 31 * result + (lieuArrivee != null ? lieuArrivee.hashCode() : 0);
        result = 31 * result + (nature != null ? nature.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Course{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", heureDepart=" + heureDepart +
                ", horaireMax=" + horaireMax +
                ", distance=" + distance +
                ", duree=" + duree +
                ", lieuDepart=" + lieuDepart +
                ", lieuArrivee=" + lieuArrivee +
                ", nature=" + nature +
                ", competition=" +  competition+
                "}";
    }
}
