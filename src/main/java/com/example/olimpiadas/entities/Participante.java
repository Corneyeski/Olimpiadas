package com.example.olimpiadas.entities;

import com.example.olimpiadas.dto.RegisterDto;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Participante extends Personal {
    private Long id;
    private LocalDate nacimiento;
    private int puntuacion;

    public Participante(String nombre, String apellidos, String dni, String password, Long id, LocalDate nacimiento, int puntuacion) {
        super(nombre, apellidos, dni, password);
        this.id = id;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }

    public Participante(String nombre, String apellidos, String dni, Long id, LocalDate nacimiento, int puntuacion) {
        super(nombre, apellidos, dni);
        this.id = id;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }

    public Participante(Long id, LocalDate nacimiento, int puntuacion) {
        this.id = id;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }
    public Participante() {}

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
