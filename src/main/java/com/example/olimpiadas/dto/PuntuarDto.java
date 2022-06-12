package com.example.olimpiadas.dto;

public class PuntuarDto {
    private Long participanteId;
    private int puntuacion;

    public PuntuarDto(Long participanteId, int puntuacion) {
        this.participanteId = participanteId;
        this.puntuacion = puntuacion;
    }

    public Long getParticipanteId() {
        return participanteId;
    }

    public void setParticipanteId(Long participanteId) {
        this.participanteId = participanteId;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
}
