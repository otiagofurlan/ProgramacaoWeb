package com.fatec.projeto.projeto2025.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController

public class ExercicioController {

    @GetMapping("") 
    public String HelloWorld() {
        return "hello";
    }
}