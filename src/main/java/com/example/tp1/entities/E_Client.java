package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "client", schema = "bdd2i_test", catalog = "")
public class E_Client {
    private int id;
    private String nom;
    private String adresse;
    private String pays;

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
    @Column(name = "adresse", nullable = true, length = 255)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "pays", nullable = true, length = 60)
    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Client eClient = (E_Client) o;

        if (id != eClient.id) return false;
        if (nom != null ? !nom.equals(eClient.nom) : eClient.nom != null) return false;
        if (adresse != null ? !adresse.equals(eClient.adresse) : eClient.adresse != null) return false;
        if (pays != null ? !pays.equals(eClient.pays) : eClient.pays != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        return result;
    }
}
