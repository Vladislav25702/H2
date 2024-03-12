package org.example;


public class Pr {
    public static void printDoctors(Doctors doctor) {
        System.out.println(doctor.getId() + " " + doctor.getName() + " "+ doctor.getSurname() + " " + doctor.getOt() + " ");
    }
    public static void printPatients(Patients patient) {
        System.out.println(patient.getId() + " " + patient.getName()+" " + patient.getSurname()+ " " + patient.getOt() + " ");
    }
    public static void printPatientsDoctors(Patients patient) {
        System.out.print(patient.getId() + " " + patient.getName() + " " + patient.getSurname() + " " + patient.getOt() + " ");
        printDoctors(patient.getIdDoctor());
    }
}
