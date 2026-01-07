package com.example.petshop;

import java.util.Date;

public abstract class Pet {
    private String name;
    private Date birthDate;
    //------

    public Pet(String name) {
        this.name = name;
        this.birthDate = new Date();
    }
    public Pet(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;

    }

    //-----
    public String getName(){
        return name;
    }
    public Date getBirthDate(){
        return birthDate;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBirthDate(Date birthDay){
        this.birthDate = birthDay;
    }

    public abstract String speak();


}
