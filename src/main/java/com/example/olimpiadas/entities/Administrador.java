package com.example.olimpiadas.entities;

import com.example.olimpiadas.dto.RegisterDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Administrador extends Personal {

    private Long id;
    private LocalDate fechaBaja;

    public Administrador(String nombre, String apellidos, String dni, String password, Long id, LocalDate fechaBaja) {
        super(nombre, apellidos, dni, password);
        this.id = id;
        this.fechaBaja = fechaBaja;
    }

    public Administrador(String nombre, String apellidos, String dni, Long id, LocalDate fechaBaja) {
        super(nombre, apellidos, dni);
        this.id = id;
        this.fechaBaja = fechaBaja;
    }

    public Administrador(Long id, LocalDate fechaBaja) {
        this.id = id;
        this.fechaBaja = fechaBaja;
    }

    public Administrador() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
}
