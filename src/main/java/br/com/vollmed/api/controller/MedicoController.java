package br.com.vollmed.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Spring Web - Informa para o Spring Boot que a classe é um controller(GET/POST/PUT/DELETE) pois não temos front-end. 
@RequestMapping("medicos ") // SPRING WEB - Cria um caminho (end-point) para a classe abaixo
public class MedicoController {
    // méetodos -> funções -> ações 
    //GET 
    //POST
    @PostMapping // SPRING WEB - Informa que o método abaixo é do tipo POST (Cadastrar)
    public void cadastrar(String dados){
        System.out.println(dados);
    }
    
    //PUT
    //DELETE 
    

}
