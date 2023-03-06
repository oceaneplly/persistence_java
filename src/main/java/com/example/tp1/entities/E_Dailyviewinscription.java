package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "dailyviewinscription", schema = "bdd2i_test", catalog = "")
public class E_Dailyviewinscription {
    private Integer idCompetition;
    private Integer idCourse;
    private long inscriptionsEnAttente;
    private Long id;

    @Basic
    @Column(name = "idCompetition", nullable = true)
    public Integer getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(Integer idCompetition) {
        this.idCompetition = idCompetition;
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
    @Column(name = "inscriptionsEnAttente", nullable = false)
    public long getInscriptionsEnAttente() {
        return inscriptionsEnAttente;
    }

    public void setInscriptionsEnAttente(long inscriptionsEnAttente) {
        this.inscriptionsEnAttente = inscriptionsEnAttente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Dailyviewinscription that = (E_Dailyviewinscription) o;

        if (inscriptionsEnAttente != that.inscriptionsEnAttente) return false;
        if (idCompetition != null ? !idCompetition.equals(that.idCompetition) : that.idCompetition != null)
            return false;
        if (idCourse != null ? !idCourse.equals(that.idCourse) : that.idCourse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCompetition != null ? idCompetition.hashCode() : 0;
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        result = 31 * result + (int) (inscriptionsEnAttente ^ (inscriptionsEnAttente >>> 32));
        return result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
