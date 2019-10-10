package com.globalurban.website.repository;

import com.globalurban.website.domain.Information;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, Long> {
}
