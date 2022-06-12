package com.example.olimpiadas.dto;

import java.time.LocalDate;

public class RegisterDto {
    private String nombre;
    private String apellidos;
    private String dni;
    private String password;
    private TypePersonal type;
    private Long numeroJuez;
    private String empresa;
    private LocalDate nacimiento;
    private int puntuacion;

    public RegisterDto(String nombre, String apellidos, String dni, String password, TypePersonal type, Long numeroJuez, String empresa, LocalDate nacimiento, int puntuacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.type = type;
        this.numeroJuez = numeroJuez;
        this.empresa = empresa;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }

    //Constructor para @Entity Juez
    public RegisterDto(String nombre, String apellidos, String dni, String password, TypePersonal type, Long numeroJuez) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.type = type;
        this.numeroJuez = numeroJuez;
    }

    //Constructor para @Entity Periodista
    public RegisterDto(String nombre, String apellidos, String dni, String password, TypePersonal type, String empresa) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.type = type;
        this.empresa = empresa;
    }

    //Constructor para @Entity Participante
    public RegisterDto(String nombre, String apellidos, String dni, String password, TypePersonal type, LocalDate nacimiento, int puntuacion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.type = type;
        this.nacimiento = nacimiento;
        this.puntuacion = puntuacion;
    }

    //Constructor para @Entity Administrador
    public RegisterDto(String nombre, String apellidos, String dni, String password, TypePersonal type) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
        this.type = type;
    }

    public RegisterDto() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TypePersonal getType() {
        return type;
    }

    public void setType(TypePersonal type) {
        this.type = type;
    }

    public Long getNumeroJuez() {
        return numeroJuez;
    }

    public void setNumeroJuez(Long numeroJuez) {
        this.numeroJuez = numeroJuez;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
