package com.example.Iv.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Iv.Model.Patient;
import com.example.Iv.repository.PatientRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/patients/")
public class PatientController 
{
	@Autowired
	private PatientRepository patientRepository;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerPatient(@Validated @RequestBody Patient patient)
	{
		patientRepository.save(patient);
		return ResponseEntity.ok("Patient registered successfully!");
	}
	
	
	
	
	
	

}
