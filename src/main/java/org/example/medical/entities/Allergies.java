package org.example.medical.entities;

import java.util.ArrayList;
import java.util.List;

public class Allergies {

    public static List<Allergies> listOfAllergies =new ArrayList<>();

    public Allergies(String name , String symptoms, String treatment){
        this.name = name;
        this.symptoms = symptoms;
        this.treatment = treatment;

    }

    private String name;
    private String symptoms;
    private String treatment;

    public String getName() {
        return name;
    }


    public String getSymptoms() {
        return symptoms;
    }

    public String getTreatment() {
        return treatment;
    }

    @Override
    public String toString() {
        return "Allergies{" +
                "name='" + name + '\'' +
                ", symptoms='" + symptoms + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }
}
