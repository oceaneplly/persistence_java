package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "categorie", schema = "bdd2i_test", catalog = "")
public class E_Categorie {
    private int id;
    private String nom;
    private String code;
    private Integer anneeMin;
    private Integer anneeMax;

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
    @Column(name = "code", nullable = true, length = 255)
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Basic
    @Column(name = "anneeMin", nullable = true)
    public Integer getAnneeMin() {
        return anneeMin;
    }

    public void setAnneeMin(Integer anneeMin) {
        this.anneeMin = anneeMin;
    }

    @Basic
    @Column(name = "anneeMax", nullable = true)
    public Integer getAnneeMax() {
        return anneeMax;
    }

    public void setAnneeMax(Integer anneeMax) {
        this.anneeMax = anneeMax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Categorie that = (E_Categorie) o;

        if (id != that.id) return false;
        if (nom != null ? !nom.equals(that.nom) : that.nom != null) return false;
        if (code != null ? !code.equals(that.code) : that.code != null) return false;
        if (anneeMin != null ? !anneeMin.equals(that.anneeMin) : that.anneeMin != null) return false;
        if (anneeMax != null ? !anneeMax.equals(that.anneeMax) : that.anneeMax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (code != null ? code.hashCode() : 0);
        result = 31 * result + (anneeMin != null ? anneeMin.hashCode() : 0);
        result = 31 * result + (anneeMax != null ? anneeMax.hashCode() : 0);
        return result;
    }
}
