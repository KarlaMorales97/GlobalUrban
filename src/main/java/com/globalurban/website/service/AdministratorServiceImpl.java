package com.globalurban.website.service;

import com.globalurban.website.domain.Administrator;
import com.globalurban.website.repository.AdministratorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministratorServiceImpl implements AdministratorService {

    @Autowired
    AdministratorRepository administratorRepository;

    @Override
    public List<Administrator> findAll() {
        return administratorRepository.findAll();
    }

    @Override
    public Boolean findByAdminAndPass(String adminName, String passAdmin) throws DataAccessException {
        if(administratorRepository.findByUnadminAndAndPassadmin(adminName,passAdmin) == null){
            return false;
        }
        return true;
    }
}
