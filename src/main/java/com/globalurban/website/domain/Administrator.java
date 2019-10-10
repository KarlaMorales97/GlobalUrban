package com.globalurban.website.domain;

import javax.persistence.*;

@Entity
@Table(name = "administrator")
public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idadmin")
    private Long idadmin;

    @Column(name = "unadmin")
    private String unadmin;

    @Column(name = "passadmin")
    private String passadmin;

    public Long getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(Long idadmin) {
        this.idadmin = idadmin;
    }

    public String getUnadmin() {
        return unadmin;
    }

    public void setUnadmin(String unadmin) {
        this.unadmin = unadmin;
    }

    public String getPassadmin() {
        return passadmin;
    }

    public void setPassadmin(String passadmin) {
        this.passadmin = passadmin;
    }
}
