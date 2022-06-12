package com.example.olimpiadas.service;

import com.example.olimpiadas.dto.RegistroDto;
import com.example.olimpiadas.exceptions.InvalidTypeException;

public interface PersonalService {

    Long registerPersonal(RegistroDto registroDto) throws InvalidTypeException;
}
