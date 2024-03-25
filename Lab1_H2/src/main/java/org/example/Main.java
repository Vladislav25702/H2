package org.example;
import java.sql.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception{
        PatientsRepository patientsRepo = new PatientsRepository();
        DoctorsRepository doctorsRepo = new DoctorsRepository();

        List<Patients> patients = patientsRepo.getList();
        List<Doctors> doctors = doctorsRepo.getList();


        for (Patients patient : patients) {
            Pr.printPatientsDoctors(patient);

        }
    }
}
