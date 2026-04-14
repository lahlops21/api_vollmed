package br.com.vollmed.api.controller;

import org.springframework.web.bind.annotation.*;

import br.com.vollmed.api.model.medico.DadosCadastroMedico;
import br.com.vollmed.api.model.medico.MedicoRepository;


@RestController // Spring Web - Informa para o Spring Boot que a classe é um controller(GET/POST/PUT/DELETE) pois não temos front-end. 
@RequestMapping("medicos") // SPRING WEB - Cria um caminho (end-point) para a classe abaixo
public class MedicoController {
    

     private MedicoRepository medicoRepository;


    @PostMapping // SPRING WEB - Informa que o método abaixo é do tipo POST (Cadastrar)
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
    //    medicoRepository.save(new Medico(dados));
        System.out.println(dados);
    }

}
