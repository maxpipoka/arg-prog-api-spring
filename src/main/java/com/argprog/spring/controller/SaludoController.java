package com.argprog.spring.controller;

import java.util.ArrayList;
import java.util.List;

import com.argprog.spring.Cliente;

import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    
    @GetMapping("/hola/{nombre}/{edad}/{profesion}")
    public String decirHola(@PathVariable String nombre,
                            @PathVariable int edad,
                            @PathVariable String profesion){
        return "Hello " + nombre + ", tu edad es " + edad + ", y sos " + profesion;
    }

    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Nuevo cliente: ");
        System.out.println("Id: " + cli.getId());
        System.out.println("Nombre: " + cli.getName());
        System.out.println("Apellido: " + cli.getSurname());

    }

    @GetMapping("/consultaclientes")
    @ResponseBody
    public List<Cliente> listarClientes(){
        List <Cliente> listaClientes = new ArrayList<Cliente>();
        listaClientes.add(new Cliente(1, "Pedro", "Tomasini"));
        listaClientes.add(new Cliente(2,"Jose", "Abreu"));
        listaClientes.add(new Cliente(3,"Marcos", "Rojo"));

        return listaClientes;

    }
}
