package com.nto.patientservice.controller;

import com.nto.patientservice.model.Patient;
import com.nto.patientservice.service.PatientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
@Api(value = "Patient Management System", tags = "Patient API")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @ApiOperation(value = "Get all patients", notes = "Returns a list of all patients")
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @ApiOperation(value = "Add a new patient", notes = "Adds a new patient to the system")
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientService.addPatient(patient);
    }
}
