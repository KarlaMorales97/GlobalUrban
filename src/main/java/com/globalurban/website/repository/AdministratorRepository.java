package com.globalurban.website.repository;

import com.globalurban.website.domain.Administrator;
import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
    public Administrator findByUnadminAndAndPassadmin(String nameAdmin, String passAdmin) throws DataAccessException;
}
