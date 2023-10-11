package org.example;


import org.example.medical.entities.Allergies;
import org.example.medical.entities.MedicalStaff;
import org.example.medical.entities.Patient;

public class Main {
    public static void main(String[] args) {;

        MedicalStaff name =new MedicalStaff();
        name.setName("drFemi");
        System.out.println("THIS IS THE CARDIOLOGIST " + name.getName());

        Patient age =new Patient();
        age.setAge(10);
        System.out.println("this is the patient age " + age.getAge());






    }
}