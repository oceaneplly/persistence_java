package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "course", schema = "bdd2i_test", catalog = "")
public class E_Course {
    private int id;
    private Integer idCompetition;
    private String nom;
    private Time heureDepart;
    private Time horaireMax;
    private Double distance;
    private Integer duree;
    private Integer lieuDepart;
    private Integer lieuArrivee;
    private Object nature;

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
    @Column(name = "idCompetition", nullable = true)
    public Integer getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(Integer idCompetition) {
        this.idCompetition = idCompetition;
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
        if (idCompetition != null ? !idCompetition.equals(eCourse.idCompetition) : eCourse.idCompetition != null)
            return false;
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
        result = 31 * result + (idCompetition != null ? idCompetition.hashCode() : 0);
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
}
