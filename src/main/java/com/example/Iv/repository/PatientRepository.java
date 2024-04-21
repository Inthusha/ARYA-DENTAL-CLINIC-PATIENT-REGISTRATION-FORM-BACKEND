package com.example.Iv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Iv.Model.Patient;

@Repository
public interface PatientRepository extends JpaRepository< Patient,Long>{

}
