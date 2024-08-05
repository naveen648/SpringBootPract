package com.example.SimpleH2JPA;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pojo {

    @Id
    private int id;
    private String name;
    private String adress;

    public Pojo(int id, String name, String adress) {
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Pojo() {
    }
}
