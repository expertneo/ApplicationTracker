package com.personalproject.applicationtracker.repository;

import com.personalproject.applicationtracker.model.Applicant;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface applicantRepository extends CrudRepository<Applicant, Integer> {
}
