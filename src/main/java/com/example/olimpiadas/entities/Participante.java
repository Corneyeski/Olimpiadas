package com.example.olimpiadas.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Participante extends Personal {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
