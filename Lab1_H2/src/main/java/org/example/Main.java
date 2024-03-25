package org.example;
import java.sql.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        PatientRepository patientRepository = new PatientsRepository();
        DoctorRepository doctorRepository = new DoctorsRepository();

        List<Patients> patients = patientRepository.getList();
        List<Doctors> doctors = doctorRepository.getList();





        for (Patients patient : patients) {
            Pr.printPatientsDoctors(patient); 

        }
    }
}
