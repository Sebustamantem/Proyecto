package com.example.proyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProyectoController {


    @GetMapping ("/saludo")
    public String Saludar(){
        return "Hola desde el controlador";
    }
    
}
