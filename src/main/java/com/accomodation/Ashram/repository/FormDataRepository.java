package com.accomodation.Ashram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accomodation.Ashram.model.FormData;

@Repository
public interface FormDataRepository extends JpaRepository<FormData, Long> {
    
}
