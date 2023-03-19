package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name = "inscription", schema = "bdd2i_test", catalog = "")
public class E_Inscription {
    private int id;
    private Timestamp dateInscr;
    private Byte validationPj;
    private Object etatInscription;
    private Integer idCoureur;
    private Integer idCourse;
    private Integer codeCategorie;
    private Integer noDossard;
    private Integer noBracelet;

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
    @Column(name = "dateInscr", nullable = true)
    public Timestamp getDateInscr() {
        return dateInscr;
    }

    public void setDateInscr(Timestamp dateInscr) {
        this.dateInscr = dateInscr;
    }

    @Basic
    @Column(name = "validationPJ", nullable = true)
    public Byte getValidationPj() {
        return validationPj;
    }

    public void setValidationPj(Byte validationPj) {
        this.validationPj = validationPj;
    }

    @Basic
    @Column(name = "etatInscription", nullable = true)
    public Object getEtatInscription() {
        return etatInscription;
    }

    public void setEtatInscription(Object etatInscription) {
        this.etatInscription = etatInscription;
    }

    @Basic
    @Column(name = "idCoureur", nullable = true)
    public Integer getIdCoureur() {
        return idCoureur;
    }

    public void setIdCoureur(Integer idCoureur) {
        this.idCoureur = idCoureur;
    }

    @Basic
    @Column(name = "idCourse", nullable = true)
    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    @Basic
    @Column(name = "codeCategorie", nullable = true)
    public Integer getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Integer codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    @Basic
    @Column(name = "noDossard", nullable = true)
    public Integer getNoDossard() {
        return noDossard;
    }

    public void setNoDossard(Integer noDossard) {
        this.noDossard = noDossard;
    }

    @Basic
    @Column(name = "noBracelet", nullable = true)
    public Integer getNoBracelet() {
        return noBracelet;
    }

    public void setNoBracelet(Integer noBracelet) {
        this.noBracelet = noBracelet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Inscription that = (E_Inscription) o;

        if (id != that.id) return false;
        if (dateInscr != null ? !dateInscr.equals(that.dateInscr) : that.dateInscr != null) return false;
        if (validationPj != null ? !validationPj.equals(that.validationPj) : that.validationPj != null) return false;
        if (etatInscription != null ? !etatInscription.equals(that.etatInscription) : that.etatInscription != null)
            return false;
        if (idCoureur != null ? !idCoureur.equals(that.idCoureur) : that.idCoureur != null) return false;
        if (idCourse != null ? !idCourse.equals(that.idCourse) : that.idCourse != null) return false;
        if (codeCategorie != null ? !codeCategorie.equals(that.codeCategorie) : that.codeCategorie != null)
            return false;
        if (noDossard != null ? !noDossard.equals(that.noDossard) : that.noDossard != null) return false;
        if (noBracelet != null ? !noBracelet.equals(that.noBracelet) : that.noBracelet != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (dateInscr != null ? dateInscr.hashCode() : 0);
        result = 31 * result + (validationPj != null ? validationPj.hashCode() : 0);
        result = 31 * result + (etatInscription != null ? etatInscription.hashCode() : 0);
        result = 31 * result + (idCoureur != null ? idCoureur.hashCode() : 0);
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        result = 31 * result + (codeCategorie != null ? codeCategorie.hashCode() : 0);
        result = 31 * result + (noDossard != null ? noDossard.hashCode() : 0);
        result = 31 * result + (noBracelet != null ? noBracelet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Inscription{" +
                "id=" + id +
                ", dateInscr=" + dateInscr +
                ", validationPj=" + validationPj +
                ", etatInscription=" + etatInscription +
                ", idCoureur=" + idCoureur +
                ", idCourse=" + idCourse +
                ", codeCategorie=" + codeCategorie +
                ", noDossard=" + noDossard +
                ", noBracelet=" + noBracelet +
                '}';
    }
}
