package com.example.olimpiadas.service.impl;

import com.example.olimpiadas.dto.ParticipanteDto;
import com.example.olimpiadas.dto.PuntuarDto;
import com.example.olimpiadas.dto.RegistroDto;
import com.example.olimpiadas.entities.Participante;
import com.example.olimpiadas.exceptions.InvalidTypeException;
import com.example.olimpiadas.exceptions.ResourceNotFoundException;
import com.example.olimpiadas.mapper.PersonalMapper;
import com.example.olimpiadas.repository.AdministradorRepository;
import com.example.olimpiadas.repository.JuezRepository;
import com.example.olimpiadas.repository.ParticipanteRepository;
import com.example.olimpiadas.repository.PeriodistaRepository;
import com.example.olimpiadas.service.PersonalService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PersonalServiceImpl implements PersonalService {

    private final AdministradorRepository administradorRepository;
    private final JuezRepository juezRepository;
    private final PeriodistaRepository periodistaRepository;
    private final ParticipanteRepository participanteRepository;

    private final PersonalMapper mapper = PersonalMapper.INSTANCE;

    public PersonalServiceImpl(AdministradorRepository administradorRepository, JuezRepository juezRepository, PeriodistaRepository periodistaRepository, ParticipanteRepository participanteRepository) {
        this.administradorRepository = administradorRepository;
        this.juezRepository = juezRepository;
        this.periodistaRepository = periodistaRepository;
        this.participanteRepository = participanteRepository;
    }

    @Override
    public Long registerPersonal(RegistroDto registroDto) throws InvalidTypeException {

        switch (registroDto.getType()){
            case ADMIN -> {
                return createEntityAdministrador(registroDto);
            }
            case JUEZ -> {
                return createEntityJuez(registroDto);
            }
            case PARTICIPANTE -> {
                return createEntityParticipante(registroDto);
            }
            case PERIODISTA -> {
                return createEntityPeriodista(registroDto);
            }
            default -> throw new InvalidTypeException();
        }
    }

    @Override
    public ParticipanteDto scoreParticipante(Long juezId, PuntuarDto puntuarDto) throws ResourceNotFoundException {

        juezRepository.findById(juezId).orElseThrow(ResourceNotFoundException::new);

        Participante participante = participanteRepository.findById(puntuarDto.getParticipanteId()).orElseThrow(ResourceNotFoundException::new);
        participante.setPuntuacion(puntuarDto.getPuntuacion());

        return mapper.participanteToParticipanteDto(participanteRepository.save(participante));
    }

    private Long createEntityJuez(RegistroDto registroDto){
        return juezRepository.save(
                mapper.registerDtoToJuez(registroDto)
        ).getId();
    }

    private Long createEntityAdministrador(RegistroDto registroDto){
        return administradorRepository.save(
                mapper.registerDtoToAdministrador(registroDto)
        ).getId();
    }

    private Long createEntityParticipante(RegistroDto registroDto){
        return participanteRepository.save(
                mapper.registerDtoToParticipante(registroDto)
        ).getId();
    }

    private Long createEntityPeriodista(RegistroDto registroDto){
        return periodistaRepository.save(
                mapper.registerDtoToPeriodista(registroDto)
        ).getId();
    }
}
