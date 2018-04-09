package com.personalproject.applicationtracker.repository;

import com.personalproject.applicationtracker.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface companyRepository extends CrudRepository<Company, Integer> {
}
