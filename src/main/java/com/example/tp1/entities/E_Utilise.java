package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utilise", schema = "bdd2i_test", catalog = "")
public class E_Utilise {
    private Integer idPointGeo;
    private Integer idCourse;
    private Integer idEquipement;
    private Long id;

    @Basic
    @Column(name = "idPointGeo", nullable = true)
    public Integer getIdPointGeo() {
        return idPointGeo;
    }

    public void setIdPointGeo(Integer idPointGeo) {
        this.idPointGeo = idPointGeo;
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
    @Column(name = "idEquipement", nullable = true)
    public Integer getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(Integer idEquipement) {
        this.idEquipement = idEquipement;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Utilise eUtilise = (E_Utilise) o;

        if (idPointGeo != null ? !idPointGeo.equals(eUtilise.idPointGeo) : eUtilise.idPointGeo != null) return false;
        if (idCourse != null ? !idCourse.equals(eUtilise.idCourse) : eUtilise.idCourse != null) return false;
        if (idEquipement != null ? !idEquipement.equals(eUtilise.idEquipement) : eUtilise.idEquipement != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPointGeo != null ? idPointGeo.hashCode() : 0;
        result = 31 * result + (idCourse != null ? idCourse.hashCode() : 0);
        result = 31 * result + (idEquipement != null ? idEquipement.hashCode() : 0);
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
