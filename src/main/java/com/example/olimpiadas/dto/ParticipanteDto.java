package com.example.olimpiadas.dto;

import java.time.LocalDate;

public class ParticipanteDto extends PersonalDto {
    private Long id;
    private LocalDate nacimiento;
    private int puntuacion;

    public ParticipanteDto(String nombre, String apellidos, String dni, Long id, LocalDate nacimiento, int puntuacion) {
        super(nombre, apellidos, dni);
        this.id = id;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }

    public ParticipanteDto(Long id, LocalDate nacimiento, int puntuacion) {
        this.id = id;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }

    public ParticipanteDto() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
