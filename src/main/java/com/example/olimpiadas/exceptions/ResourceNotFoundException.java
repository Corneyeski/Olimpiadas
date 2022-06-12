package com.example.olimpiadas.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Requested resource not found")
public class ResourceNotFoundException extends Exception{
}
