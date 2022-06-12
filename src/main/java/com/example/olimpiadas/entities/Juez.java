package com.example.olimpiadas.entities;

import com.example.olimpiadas.dto.RegistroDto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

    public Juez(RegistroDto registroDto){
        super(registroDto.getNombre(), registroDto.getApellidos(), registroDto.getDni(), registroDto.getPassword());
        this.numeroJuez = registroDto.getNumeroJuez();
    }

    public Juez() {}

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
