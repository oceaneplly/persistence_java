package com.example.tp1.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pointgeo", schema = "bdd2i_test", catalog = "")
public class E_Pointgeo {
    private int id;
    private String longitude;
    private String latitude;
    private String commune;
    private String region;
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
    @Column(name = "longitude", nullable = true, length = 255)
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "latitude", nullable = true, length = 255)
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "commune", nullable = true, length = 255)
    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    @Basic
    @Column(name = "region", nullable = true, length = 255)
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "pays", nullable = true, length = 255)
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

        E_Pointgeo ePointgeo = (E_Pointgeo) o;

        if (id != ePointgeo.id) return false;
        if (longitude != null ? !longitude.equals(ePointgeo.longitude) : ePointgeo.longitude != null) return false;
        if (latitude != null ? !latitude.equals(ePointgeo.latitude) : ePointgeo.latitude != null) return false;
        if (commune != null ? !commune.equals(ePointgeo.commune) : ePointgeo.commune != null) return false;
        if (region != null ? !region.equals(ePointgeo.region) : ePointgeo.region != null) return false;
        if (pays != null ? !pays.equals(ePointgeo.pays) : ePointgeo.pays != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (commune != null ? commune.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (pays != null ? pays.hashCode() : 0);
        return result;
    }
}
