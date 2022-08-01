package com.aop.patient;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

	@Autowired
	private PatientRepository repo;

	public PatientDetails CreatePatient(PatientDetails patientDetails) {
		return repo.save(patientDetails);
	}

	public PatientDetails updatePatient(PatientDetails patientDetails) {
		Optional<PatientDetails> existedPatient = repo.findById(patientDetails.getPatientID());
		if (existedPatient.isPresent()) {
			PatientDetails updatedPatient = existedPatient.get();
			updatedPatient.setAddress(patientDetails.getAddress());
			updatedPatient.setAppointmentID(patientDetails.getAppointmentID());
			updatedPatient.setContact(patientDetails.getContact());
			updatedPatient.setPatientName(patientDetails.getPatientName());
			return updatedPatient;
		} else
			return null;
	}

	public PatientDetails getPatientByID(Integer patientID) {
		Optional<PatientDetails> existedPatient = repo.findById(patientID);
		if (existedPatient.isPresent()) {
			return existedPatient.get();
		} else
			return null;
	}

	public PatientDetails deletePatientByID(Integer patientID) {
		Optional<PatientDetails> existedPatient = repo.findById(patientID);
		if (existedPatient.isPresent()) {
			return existedPatient.get();
		} else
			return null;
	}

	public List<PatientDetails> getAllPatient() {
		return repo.findAll();
	}
}
