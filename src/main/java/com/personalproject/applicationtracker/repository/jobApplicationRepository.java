package com.personalproject.applicationtracker.repository;

import com.personalproject.applicationtracker.model.JobApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jobApplicationRepository extends CrudRepository<JobApplication, Integer> {
}
