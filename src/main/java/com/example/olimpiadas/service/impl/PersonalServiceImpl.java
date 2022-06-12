package com.example.olimpiadas.service.impl;

import com.example.olimpiadas.dto.RegisterDto;
import com.example.olimpiadas.entities.Juez;
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

    private PersonalMapper mapper = PersonalMapper.INSTANCE;

    public PersonalServiceImpl(AdministradorRepository administradorRepository, JuezRepository juezRepository, PeriodistaRepository periodistaRepository, ParticipanteRepository participanteRepository) {
        this.administradorRepository = administradorRepository;
        this.juezRepository = juezRepository;
        this.periodistaRepository = periodistaRepository;
        this.participanteRepository = participanteRepository;
    }

    @Override
    public void registerPersonal(RegisterDto registerDto) {

        switch (registerDto.getType()){
            case ADMIN -> createEntityAdministrador(registerDto);

            case JUEZ -> createEntityJuez(registerDto);

            case PARTICIPANTE -> createEntityParticipante(registerDto);

            case PERIODISTA -> createEntityPeriodista(registerDto);

        }

    }

    private void createEntityJuez(RegisterDto registerDto){

        Juez juez = mapper.registerDtoToJuez(registerDto);

        juezRepository.findAll();
    }

    private void createEntityAdministrador(RegisterDto registerDto){

        //administradorRepository.save();
    }

    private void createEntityParticipante(RegisterDto registerDto){

    }

    private void createEntityPeriodista(RegisterDto registerDto){

    }
}
