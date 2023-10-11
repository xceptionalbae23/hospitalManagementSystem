package org.example.medical.entities;

import org.example.medical.enums.BloodGroup;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public abstract class User {
    private String name;
    private int age;
    private String maritalStatus;
    private int phoneNumber;
    private String address;
    private String Gender;
    private String Genotype;
    private BloodGroup bloodGroup;
    private BigDecimal salary;
    private String NOK;
    private String speciality;
    private String role;
    private String grade;
    private String height;
    private String weight;
    private String diagnosis;
    private String medicalHistory;
    private LocalDateTime dateofAppointment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getNOK() {
        return NOK;
    }

    public void setNOK(String NOK) {
        this.NOK = NOK;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
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

    public LocalDateTime getDateofAppointment() {
        return dateofAppointment;
    }

    public void setDateofAppointment(LocalDateTime dateofAppointment) {
        this.dateofAppointment = dateofAppointment;
    }
}
