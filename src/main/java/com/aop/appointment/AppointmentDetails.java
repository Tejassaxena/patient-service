package com.aop.appointment;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.aop.doctor.DoctorDetails;
import com.aop.patient.PatientDetails;

@Table
@Entity
public class AppointmentDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointmentID;

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "patient_id", referencedColumnName = "id")
//	private PatientDetails patientDetails;
}
