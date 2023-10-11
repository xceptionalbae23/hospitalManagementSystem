package org.example.medical.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Patient extends User {

    public static List<Patient> listOfPatient = new ArrayList<>();


    private String address;
    private String Gender;
    private String Genotype;
    private String NOK;
    private List<Allergies> allergies;
    private String height;
    private String weight;
    private String diagnosis;
    private String medicalHistory;
    private LocalDateTime dateOfAppointment;



    public List<Allergies> getAllergies() {
        return allergies;
    }

    public void setAllergies(List<Allergies> allergies) {
        this.allergies = allergies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getGenotype() {
        return Genotype;
    }

    public void setGenotype(String genotype) {
        Genotype = genotype;
    }



    public String getNOK() {
        return NOK;
    }

    public void setNOK(String NOK) {
        this.NOK = NOK;
    }


    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public LocalDateTime getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(LocalDateTime dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
}
