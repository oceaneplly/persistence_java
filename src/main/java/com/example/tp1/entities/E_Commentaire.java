package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "commentaire", schema = "bdd2i_test", catalog = "")
public class E_Commentaire {
    private int idCommentaire;
    private Integer idInscription;
    private Integer idPg;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idCommentaire", nullable = false)
    public int getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(int idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    @Basic
    @Column(name = "idInscription", nullable = true)
    public Integer getIdInscription() {
        return idInscription;
    }

    public void setIdInscription(Integer idInscription) {
        this.idInscription = idInscription;
    }

    @Basic
    @Column(name = "idPG", nullable = true)
    public Integer getIdPg() {
        return idPg;
    }

    public void setIdPg(Integer idPg) {
        this.idPg = idPg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Commentaire that = (E_Commentaire) o;

        if (idCommentaire != that.idCommentaire) return false;
        if (idInscription != null ? !idInscription.equals(that.idInscription) : that.idInscription != null)
            return false;
        if (idPg != null ? !idPg.equals(that.idPg) : that.idPg != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCommentaire;
        result = 31 * result + (idInscription != null ? idInscription.hashCode() : 0);
        result = 31 * result + (idPg != null ? idPg.hashCode() : 0);
        return result;
    }
}
