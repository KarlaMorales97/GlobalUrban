package com.globalurban.website.domain;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idclient")
    private Long idclient;

    @Column(name = "unclient")
    private String userClient;

    @Column(name = "passclient")
    private String passClient;

    public Long getIdclient() {
        return idclient;
    }

    public void setIdclient(Long idclient) {
        this.idclient = idclient;
    }

    public String getUserClient() {
        return userClient;
    }

    public void setUserClient(String userClient) {
        this.userClient = userClient;
    }

    public String getPassClient() {
        return passClient;
    }

    public void setPassClient(String passClient) {
        this.passClient = passClient;
    }
}
