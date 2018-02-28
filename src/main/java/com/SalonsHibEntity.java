package com;

import javax.persistence.*;

@Entity
@Table(name = "salons_hib", schema = "S208069")
public class SalonsHibEntity {
    private Long salonsId;
    private String location;
    private Long clientId;

    @Basic
    @Column(name = "salons_id")
    public Long getSalonsId() {
        return salonsId;
    }

    public void setSalonsId(Long salonsId) {
        this.salonsId = salonsId;
    }

    @Basic
    @Column(name = "location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Basic
    @Column(name = "client_id")
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SalonsHibEntity that = (SalonsHibEntity) o;

        if (salonsId != null ? !salonsId.equals(that.salonsId) : that.salonsId != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = salonsId != null ? salonsId.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        return result;
    }

    private String id;

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
