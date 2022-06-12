package com.example.olimpiadas.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Requested the incorrect type of personal")
public class InvalidTypeException extends Exception {
}
