package com.globalurban.website.service;

import com.globalurban.website.domain.Administrator;
import com.globalurban.website.domain.Information;
import org.springframework.dao.DataAccessException;

import java.util.List;

public interface AdministratorService {
    List<Administrator> findAll();
    public Boolean findByAdminAndPass(String adminName, String passAdmin) throws DataAccessException;
}
