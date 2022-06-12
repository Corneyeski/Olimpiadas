package com.example.olimpiadas.mapper;

import com.example.olimpiadas.dto.ParticipanteDto;
import com.example.olimpiadas.dto.RegistroDto;
import com.example.olimpiadas.entities.Administrador;
import com.example.olimpiadas.entities.Juez;
import com.example.olimpiadas.entities.Participante;
import com.example.olimpiadas.entities.Periodista;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonalMapper {

    PersonalMapper INSTANCE = Mappers.getMapper( PersonalMapper.class );
    Juez registerDtoToJuez(RegistroDto registroDto);
    Administrador registerDtoToAdministrador(RegistroDto registroDto);
    Participante registerDtoToParticipante(RegistroDto registroDto);
    ParticipanteDto participanteToParticipanteDto(Participante participante);
    Periodista registerDtoToPeriodista(RegistroDto registroDto);

}
