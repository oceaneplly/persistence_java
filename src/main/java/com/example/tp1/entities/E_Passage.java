package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Time;

@Entity
@Table(name = "passage", schema = "bdd2i_test", catalog = "")
public class E_Passage {
    private int idPassage;
    private Time dateHeurePassage;
    private Integer idEmplacement;
    private Integer idBracelet;
    private Integer idCourse;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idPassage", nullable = false)
    public int getIdPassage() {
        return idPassage;
    }

    public void setIdPassage(int idPassage) {
        this.idPassage = idPassage;
    }

    @Basic
    @Column(name = "dateHeurePassage", nullable = true)
    public Time getDateHeurePassage() {
        return dateHeurePassage;
    }

    public void setDateHeurePassage(Time dateHeurePassage) {
        this.dateHeurePassage = dateHeurePassage;
    }

    @Basic
    @Column(name = "idEmplacement", nullable = true)
    public Integer getIdEmplacement() {
        return idEmplacement;
    }

    public void setIdEmplacement(Integer idEmplacement) {
        this.idEmplacement = idEmplacement;
    }

    @Basic
    @Column(name = "idBracelet", nullable = true)
    public Integer getIdBracelet() {
        return idBracelet;
    }

    public void setIdBracelet(Integer idBracelet) {
        this.idBracelet = idBracelet;
    }

    @Basic
    @Column(name = "idCourse", nullable = true)
    public Integer getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Integer idCourse) {
        this.idCourse = idCourse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Passage ePassage = (E_Passage) o;

        if (idPassage != ePassage.idPassage) return false;
        if (dateHeurePassage != null ? !dateHeurePassage.equals(ePassage.dateHeurePassage) : ePassage.dateHeurePassage != null)
            return false;
        if (idEmplacement != null ? !idEmplacement.equals(ePassage.idEmplacement) : ePassage.idEmplacement != null)
            return false;
        if (idBracelet != null ? !idBracelet.equals(ePassage.idBracelet) : ePassage.idBracelet != null) return false;
        if (idCourse != null ? !idCourse.equals(ePassage.idCourse) : ePassage.idCourse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPassage;
        result = 31 * result + (dateHeurePassage != null ? dateHeurePassage.hashCode() : 0);
        result = 31 * result + (idEmplacement != null ? idEmplacement.hashCode() : 0);
        result = 31 * result + (idBracelet != null ? idBracelet.hashCode() : 0);
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Passage{" +
                "idPassage=" + idPassage +
                ", dateHeurePassage=" + dateHeurePassage +
                ", idEmplacement=" + idEmplacement +
                ", idBracelet=" + idBracelet +
                ", idCourse=" + idCourse +
                '}';
    }
}
