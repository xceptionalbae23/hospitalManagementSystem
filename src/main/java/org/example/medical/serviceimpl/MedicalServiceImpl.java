package org.example.medical.serviceimpl;

import org.example.medical.entities.Allergies;
import org.example.medical.entities.MedicalStaff;
import org.example.medical.entities.Patient;
import org.example.medical.services.MedicalService;

public class MedicalServiceImpl implements MedicalService {

    @Override
    public void admit(Patient patient, Allergies allergies) {
        Patient.listOfPatient.add(patient);
        Allergies.listOfAllergies.add(allergies);
    }

    @Override
    public void diagonisePatient(Patient patient, MedicalStaff doctor, Allergies listOfAllergies) {
        Patient.listOfPatient.add(patient);
        Allergies.listOfAllergies.add(listOfAllergies);

    }


}
