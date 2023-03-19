package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "equipement", schema = "bdd2i_test", catalog = "")
public class E_Equipement {
    private int id;
    private String numeroSerie;
    private Object typeEquipement;
    private Byte estAffectee;

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
    @Column(name = "numeroSerie", nullable = true, length = 20)
    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Basic
    @Column(name = "typeEquipement", nullable = true)
    public Object getTypeEquipement() {
        return typeEquipement;
    }

    public void setTypeEquipement(Object typeEquipement) {
        this.typeEquipement = typeEquipement;
    }

    @Basic
    @Column(name = "estAffectee", nullable = true)
    public Byte getEstAffectee() {
        return estAffectee;
    }

    public void setEstAffectee(Byte estAffectee) {
        this.estAffectee = estAffectee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Equipement that = (E_Equipement) o;

        if (id != that.id) return false;
        if (numeroSerie != null ? !numeroSerie.equals(that.numeroSerie) : that.numeroSerie != null) return false;
        if (typeEquipement != null ? !typeEquipement.equals(that.typeEquipement) : that.typeEquipement != null)
            return false;
        if (estAffectee != null ? !estAffectee.equals(that.estAffectee) : that.estAffectee != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (numeroSerie != null ? numeroSerie.hashCode() : 0);
        result = 31 * result + (typeEquipement != null ? typeEquipement.hashCode() : 0);
        result = 31 * result + (estAffectee != null ? estAffectee.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Equipement{" +
                "id=" + id +
                ", numeroSerie='" + numeroSerie + '\'' +
                ", typeEquipement=" + typeEquipement +
                ", estAffectee=" + estAffectee +
                '}';
    }
}
