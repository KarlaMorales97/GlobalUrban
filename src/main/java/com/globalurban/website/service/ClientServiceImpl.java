package com.globalurban.website.service;

import com.globalurban.website.domain.Client;
import com.globalurban.website.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client save(Client client) throws DataAccessException {
        return clientRepository.save(client);
    }

    @Override
    public Boolean findByClientAndPass(String clientUser, String passClient) throws DataAccessException {
        if(clientRepository.findByUserClientAndAndPassClient(clientUser,passClient) == null){
            return false;
        }
        return true;
    }

    @Override
    public Client findByClient(String clientUser) throws DataAccessException {
        return clientRepository.findByUserClient(clientUser);
    }
}
