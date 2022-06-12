package com.example.olimpiadas.entities;

import com.example.olimpiadas.dto.RegisterDto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Juez extends Personal {
    private Long id;
    private Long numeroJuez;

    public Juez(String nombre, String apellidos, String dni, String password, Long id, Long numeroJuez) {
        super(nombre, apellidos, dni, password);
        this.id = id;
        this.numeroJuez = numeroJuez;
    }

    public Juez(String nombre, String apellidos, String dni, Long id, Long numeroJuez) {
        super(nombre, apellidos, dni);
        this.id = id;
        this.numeroJuez = numeroJuez;
    }

    public Juez(RegisterDto registerDto){
        super(registerDto.getNombre(), registerDto.getApellidos(), registerDto.getDni(), registerDto.getPassword());
        this.numeroJuez = registerDto.getNumeroJuez();
    }

    public Juez() {}

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Long getNumeroJuez() {
        return numeroJuez;
    }

    public void setNumeroJuez(Long numeroJuez) {
        this.numeroJuez = numeroJuez;
    }
}
