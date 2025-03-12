package com.fatec.projeto.projeto2025.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.projeto.projeto2025.entities.Cliente;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private static final Logger logger = LoggerFactory.getLogger(ClienteController);

    //http://localhost:8080/api/cliente => POST
    @PostMapping("criarCliente")
    public String postMethodName(@RequestBody String entity) {        
        return entity;
    }

    public String criarCliente(Cliente cliente) {
        logger.info(format: "Recebido JSON: Nome={}, idade{}", cliente.getNome());
        return "O cliente "+cliente.getNome()+ " de idade"+cliente.getIdade()+ "endereço na " +cliente.getEndereco() + "foi criado.";
    }
}
