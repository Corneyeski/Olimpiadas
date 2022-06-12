package com.example.olimpiadas.mapper;

import com.example.olimpiadas.dto.RegisterDto;
import com.example.olimpiadas.entities.Juez;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonalMapper {

    PersonalMapper INSTANCE = Mappers.getMapper( PersonalMapper.class );
    Juez registerDtoToJuez(RegisterDto registerDto);

}
