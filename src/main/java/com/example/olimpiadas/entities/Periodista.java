package com.example.olimpiadas.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Periodista extends Personal {

    private Long id;
    private String empresa;

    public Periodista(String nombre, String apellidos, String dni, String password, Long id, String empresa) {
        super(nombre, apellidos, dni, password);
        this.id = id;
        this.empresa = empresa;
    }

    public Periodista(String nombre, String apellidos, String dni, Long id, String empresa) {
        super(nombre, apellidos, dni);
        this.id = id;
        this.empresa = empresa;
    }

    public Periodista(Long id, String empresa) {
        this.id = id;
        this.empresa = empresa;
    }

    public Periodista() {}

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
