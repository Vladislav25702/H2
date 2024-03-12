package org.example;



public class Patients {
    private Integer id;
    private String name;
    private String surname;
    private String ot;
    private Doctors idDoctor;


    public Patients(Integer id, String name, String surname, String ot, Doctors id2) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.ot = ot;
        this.idDoctor = id2;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOt() {
        return ot;
    }

    public void setOt(String ot) {
        this.ot = ot;
    }

    public Doctors getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctors idDoctor) {
        this.idDoctor = idDoctor;
    }


}