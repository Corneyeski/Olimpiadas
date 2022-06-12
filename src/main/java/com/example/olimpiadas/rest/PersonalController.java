package com.example.olimpiadas.rest;

import com.example.olimpiadas.dto.PuntuarDto;
import com.example.olimpiadas.dto.RegistroDto;
import com.example.olimpiadas.exceptions.InvalidTypeException;
import com.example.olimpiadas.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/personal")
public class PersonalController {

    private final PersonalService personalService;

    @Autowired
    public PersonalController(PersonalService personalService) {
        this.personalService = personalService;
    }

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public Long register(@RequestBody RegistroDto registroDto) throws InvalidTypeException {
        return personalService.registerPersonal(registroDto);
    }

    @PutMapping("/puntuacion/{id}")
    public void giveScore(@PathVariable Long id, @RequestBody PuntuarDto puntuarDto){

    }
}
