package com;

import javax.persistence.*;

@Entity
@Table(name = "client_hib", schema = "S208069")
public class ClientHibEntity {
    private Long clientId;
    private String dog;

    @Basic
    @Column(name = "client_id")
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Basic
    @Column(name = "dog")
    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientHibEntity that = (ClientHibEntity) o;

        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (dog != null ? !dog.equals(that.dog) : that.dog != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientId != null ? clientId.hashCode() : 0;
        result = 31 * result + (dog != null ? dog.hashCode() : 0);
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
