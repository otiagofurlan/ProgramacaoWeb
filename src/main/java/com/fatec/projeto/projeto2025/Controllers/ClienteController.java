package com.fatec.projeto.projeto2025.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.projeto.projeto2025.entities.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    //http://localhost:8080/api/cliente => POST
    @PostMapping("criarCliente")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }

    public String criarCliente(Cliente cliente) {
        return "O cliente "+cliente.getNome()+ " de idade"+cliente.getIdade()+"foi criado.";
    }
}
