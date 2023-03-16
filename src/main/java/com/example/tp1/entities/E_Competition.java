package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
@Table(name = "competition", schema = "bdd2i_test", catalog = "")
public class E_Competition {
    @GeneratedValue(strategy = GenerationType.IDENTITY)  @Id
    private int id;
    private String nom;
    private Timestamp dateDebut;
    private Timestamp dateFin;
    private String adressePc;
    private Integer idClient;

    @OneToMany(targetEntity = E_Course.class, mappedBy = "competition")
    private List<E_Course> courses = new ArrayList<>();

    public E_Competition() {};
    public E_Competition(int id, String nom, Timestamp dateDebut, Timestamp dateFin, String adressePc, Integer idClient) {
        this.id = id;
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.adressePc = adressePc;
        this.idClient = idClient;
    }

    public E_Competition(int id) {
        this.id = id;
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
    @Column(name = "dateDebut", nullable = true)
    public Timestamp getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Timestamp dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Basic
    @Column(name = "dateFin", nullable = true)
    public Timestamp getDateFin() {
        return dateFin;
    }

    public void setDateFin(Timestamp dateFin) {
        this.dateFin = dateFin;
    }

    @Basic
    @Column(name = "adressePC", nullable = true, length = 255)
    public String getAdressePc() {
        return adressePc;
    }

    public void setAdressePc(String adressePc) {
        this.adressePc = adressePc;
    }

    @Basic
    @Column(name = "idClient", nullable = true)
    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Competition that = (E_Competition) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (dateDebut != null ? !dateDebut.equals(that.dateDebut) : that.dateDebut != null) return false;
        if (dateFin != null ? !dateFin.equals(that.dateFin) : that.dateFin != null) return false;
        if (adressePc != null ? !adressePc.equals(that.adressePc) : that.adressePc != null) return false;
        if (idClient != null ? !idClient.equals(that.idClient) : that.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (dateDebut != null ? dateDebut.hashCode() : 0);
        result = 31 * result + (dateFin != null ? dateFin.hashCode() : 0);
        result = 31 * result + (adressePc != null ? adressePc.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }

    public List<E_Course> getCourses() {
        return courses;
    }

    public void setCourses(List<E_Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "E_Competition{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", adressePc='" + adressePc + '\'' +
                ", idClient=" + idClient +
                '}';
    }
}
