package com.example.olimpiadas.service;

import com.example.olimpiadas.dto.ParticipanteDto;
import com.example.olimpiadas.dto.PuntuarDto;
import com.example.olimpiadas.dto.RegistroDto;
import com.example.olimpiadas.exceptions.InvalidTypeException;
import com.example.olimpiadas.exceptions.ResourceNotFoundException;

public interface PersonalService {

    Long registerPersonal(RegistroDto registroDto) throws InvalidTypeException;

    ParticipanteDto scoreParticipante(Long juezId, PuntuarDto puntuarDto) throws ResourceNotFoundException;
}
