package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "competition", schema = "bdd2i_test", catalog = "")
public class E_Competition {
    private int id;
    private String nom;
    private Timestamp dateDebut;
    private Timestamp dateFin;
    private String adressePc;
    private Integer idClient;

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
}
