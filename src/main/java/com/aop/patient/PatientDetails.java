package com.aop.patient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patientID;
	private String patientName;
	private String address;
	private Long contact;
	private Integer appointmentID;

	public PatientDetails() {
		super();
	}

	public PatientDetails(Integer patientID, String patientName, String address, Long contact, Integer appointmentID) {
		super();
		this.patientID = patientID;
		this.patientName = patientName;
		this.address = address;
		this.contact = contact;
		this.appointmentID = appointmentID;
	}

	public Integer getPatientID() {
		return patientID;
	}

	public void setPatientID(Integer patientID) {
		this.patientID = patientID;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public Integer getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(Integer appointmentID) {
		this.appointmentID = appointmentID;
	}

	@Override
	public String toString() {
		return "PatientDetails [patientID=" + patientID + ", patientName=" + patientName + ", address=" + address
				+ ", contact=" + contact + ", appointmentID=" + appointmentID + "]";
	}

}
