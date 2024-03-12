package org.example;
public class Doctors_Patients {
    private int id;
    private Doctors idDoctor;
    private Patients idPatients;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Patients getIdPatients() {
        return idPatients;
    }

    public void setIdPatients(Patients idPatients) {
        this.idPatients = idPatients;
    }

    public Doctors getIdDoctors(){
        return idDoctor;
    }
    public void setIdDoctors(Doctors idDoctor){
        this.idDoctor = idDoctor;
    }

}
