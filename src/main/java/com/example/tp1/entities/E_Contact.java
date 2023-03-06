package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "contact", schema = "bdd2i_test", catalog = "")
public class E_Contact {
    private int id;
    private String prenom;
    private String telephone;
    private String mail;
    private String mission;
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
    @Column(name = "prenom", nullable = true, length = 255)
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "telephone", nullable = true, length = 255)
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
    @Column(name = "mission", nullable = true, length = 255)
    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
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

        E_Contact eContact = (E_Contact) o;

        if (id != eContact.id) return false;
        if (prenom != null ? !prenom.equals(eContact.prenom) : eContact.prenom != null) return false;
        if (telephone != null ? !telephone.equals(eContact.telephone) : eContact.telephone != null) return false;
        if (mail != null ? !mail.equals(eContact.mail) : eContact.mail != null) return false;
        if (mission != null ? !mission.equals(eContact.mission) : eContact.mission != null) return false;
        if (idClient != null ? !idClient.equals(eContact.idClient) : eContact.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        result = 31 * result + (mission != null ? mission.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }
}
