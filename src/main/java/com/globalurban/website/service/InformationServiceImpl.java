package com.globalurban.website.service;

import com.globalurban.website.domain.Information;
import com.globalurban.website.repository.InformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationServiceImpl implements InformationService {

    @Autowired
    InformationRepository informationRepository;

    @Override
    public List<Information> findAll() {
        return informationRepository.findAll();
    }

    @Override
    public Information findOne(Long id) throws DataAccessException {
        return informationRepository.findById(id).get();
    }

    @Override
    public Information save(Information information) throws DataAccessException {
        return informationRepository.save(information);
    }
}
