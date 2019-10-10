package com.globalurban.website.repository;

import com.globalurban.website.domain.Administrator;
import com.globalurban.website.domain.Client;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    public Client findByUserClientAndAndPassClient(String nameAdmin, String passAdmin) throws DataAccessException;
}
