package com.luigioo.nov04;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Act {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    public Act(){

    }

    public Act(String name) {
        this.name = name;
    }
}
