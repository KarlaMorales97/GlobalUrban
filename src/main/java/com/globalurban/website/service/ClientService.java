package com.globalurban.website.service;

import com.globalurban.website.domain.Client;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    public Client save(Client client) throws DataAccessException;
    public Boolean findByClientAndPass(String clientUser, String passClient) throws DataAccessException;

    public Client findByClient(String clientUser) throws DataAccessException;
}
