package com.aop.patient;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

	@Autowired
	private PatientService service;

	@GetMapping("/get")
	public PatientDetails get() {
		return new PatientDetails(12, "patient1", "pune", 1234567890L, 1234);
	}

	@PostMapping("/createPatient")
	public PatientDetails CreatePatient(@RequestBody PatientDetails patientDetails) {
		return service.CreatePatient(patientDetails);
	}

	@PutMapping("/updatePatient")
	public PatientDetails updatePatient(@RequestBody PatientDetails patientDetails) {
		return service.updatePatient(patientDetails);
	}

	@GetMapping("/getPatientByID/{patientID}")
	public PatientDetails getPatientByID(@PathVariable Integer patientID) {
		return service.getPatientByID(patientID);
	}

	@DeleteMapping("/deletePatientByID/{patientID}")
	public PatientDetails deletePatientByID(Integer patientID) {
		return service.deletePatientByID(patientID);
	}

	@GetMapping("/getAllPatient")
	public List<PatientDetails> getAllPatient() {
		return service.getAllPatient();
	}

}
