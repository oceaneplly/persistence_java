package com.example.tp1.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "coureur", schema = "bdd2i_test", catalog = "")
public class E_Coureur {
    private int id;
    private String mail;
    private String motDePasse;
    private String adresse;
    private String tel;
    private String numLicence;
    private String nom;
    private String prenom;
    private String sexe;
    private Date dateDeNaissance;
    private Object etatCoureur;

    public E_Coureur() {
    }
    public E_Coureur(int id) {
        this.id = id;
    }

    public E_Coureur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

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
    @Column(name = "mail", nullable = true, length = 255)
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "motDePasse", nullable = true, length = 255)
    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
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
    @Column(name = "tel", nullable = true, length = 255)
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "numLicence", nullable = true, length = 255)
    public String getNumLicence() {
        return numLicence;
    }

    public void setNumLicence(String numLicence) {
        this.numLicence = numLicence;
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
    @Column(name = "prenom", nullable = true, length = 255)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "sexe", nullable = true, length = 255)
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    @Basic
    @Column(name = "dateDeNaissance", nullable = true)
    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    @Basic
    @Column(name = "etatCoureur", nullable = true)
    public Object getEtatCoureur() {
        return etatCoureur;
    }

    public void setEtatCoureur(Object etatCoureur) {
        this.etatCoureur = etatCoureur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        E_Coureur eCoureur = (E_Coureur) o;

        if (id != eCoureur.id) return false;
        if (mail != null ? !mail.equals(eCoureur.mail) : eCoureur.mail != null) return false;
        if (motDePasse != null ? !motDePasse.equals(eCoureur.motDePasse) : eCoureur.motDePasse != null) return false;
        if (adresse != null ? !adresse.equals(eCoureur.adresse) : eCoureur.adresse != null) return false;
        if (tel != null ? !tel.equals(eCoureur.tel) : eCoureur.tel != null) return false;
        if (numLicence != null ? !numLicence.equals(eCoureur.numLicence) : eCoureur.numLicence != null) return false;
        if (nom != null ? !nom.equals(eCoureur.nom) : eCoureur.nom != null) return false;
        if (prenom != null ? !prenom.equals(eCoureur.prenom) : eCoureur.prenom != null) return false;
        if (sexe != null ? !sexe.equals(eCoureur.sexe) : eCoureur.sexe != null) return false;
        if (dateDeNaissance != null ? !dateDeNaissance.equals(eCoureur.dateDeNaissance) : eCoureur.dateDeNaissance != null)
            return false;
        if (etatCoureur != null ? !etatCoureur.equals(eCoureur.etatCoureur) : eCoureur.etatCoureur != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (motDePasse != null ? motDePasse.hashCode() : 0);
        result = 31 * result + (adresse != null ? adresse.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (numLicence != null ? numLicence.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (sexe != null ? sexe.hashCode() : 0);
        result = 31 * result + (dateDeNaissance != null ? dateDeNaissance.hashCode() : 0);
        result = 31 * result + (etatCoureur != null ? etatCoureur.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "E_Coureur{" +
                "id=" + id +
                ", mail='" + mail + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                ", adresse='" + adresse + '\'' +
                ", tel='" + tel + '\'' +
                ", numLicence='" + numLicence + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", dateDeNaissance=" + dateDeNaissance +
                ", etatCoureur=" + etatCoureur +
                '}';
    }
}
