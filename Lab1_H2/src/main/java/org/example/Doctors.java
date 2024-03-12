package org.example;



public class Doctors {
    private Integer id;
    private String name;
    private String surname;
    private String ot;


    public Doctors(Integer id, String name, String surname, String ot) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.ot = ot;
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


}