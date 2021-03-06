package com.ehr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ehr.model.Patient;
import com.ehr.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	PatientRepository patientRepository;
	
	//@Transactional
	public List<Patient> getAllPatients() {
		return (List<Patient>) patientRepository.findAll();
	}
		
	public Optional<Patient> getPatient(Long patientID) {
		
		System.out.println("serviceData2: "+patientRepository.findById(patientID));
		return patientRepository.findById(patientID);
	}
	
	public void savePatient(Patient patinet) {
		patientRepository.save(patinet);
	}

	public Patient findByUserId(int userId) {
		return patientRepository.findByUserId(userId);
	}
	
    public Patient findById(int patientId) {
        return patientRepository.findByPatientId(patientId);
    }
	
}
