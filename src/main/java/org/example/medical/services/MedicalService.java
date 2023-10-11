package org.example.medical.services;

import org.example.medical.entities.Allergies;
import org.example.medical.entities.MedicalStaff;
import org.example.medical.entities.Patient;

public interface MedicalService {

    void admit(Patient patient, Allergies allergies);
    void diagonisePatient(Patient patient, MedicalStaff doctor ,Allergies listOfAllergies);

}
