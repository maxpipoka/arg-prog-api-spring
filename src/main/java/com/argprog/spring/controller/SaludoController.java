package com.argprog.spring.controller;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    
    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable int edad,
                            @PathVariable String profesion){
        return "Hello " + nombre + ", tu edad es " + edad + ", y sos " + profesion;
    }
}
