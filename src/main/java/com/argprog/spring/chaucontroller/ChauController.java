package com.argprog.spring.chaucontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChauController {
    
    @GetMapping("/chau")
    public String decirChau(){
        return "Hasta luego querido";
    }
}
