package com.nto.patientservice.service;

import com.nto.patientservice.model.Patient;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PatientService {
    private final List<Patient> patients = new ArrayList<>();

    public List<Patient> getAllPatients() {
        return patients;
    }

    public Patient addPatient(Patient patient) {
        patients.add(patient);
        return patient;
    }
}
