package com.example.olimpiadas.entities;

import com.example.olimpiadas.dto.RegisterDto;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Personal {
    private String nombre;
    private String apellidos;
    private String dni;
    private String password;

    public Personal(String nombre, String apellidos, String dni, String password) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.password = password;
    }
    public Personal(String nombre, String apellidos, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    public Personal() {}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
}
