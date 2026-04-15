package br.com.vollmed.api.controller;

import br.com.vollmed.api.ApiApplication;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.vollmed.api.model.medico.DadosCadastroMedico;
import br.com.vollmed.api.model.medico.DadosListagemMedico;
import br.com.vollmed.api.model.medico.Medico;
import br.com.vollmed.api.model.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController // Spring Web - Informa para o Spring Boot que a classe é um controller(GET/POST/PUT/DELETE) pois não temos front-end. 
@RequestMapping("medicos") // SPRING WEB - Cria um caminho (end-point) para a classe abaixo
public class MedicoController {
    
    private final ApiApplication apiApplication;
    @Autowired
    private MedicoRepository medicoRepository;


    MedicoController(ApiApplication apiApplication) {
        this.apiApplication = apiApplication;
    }


    @PostMapping // SPRING WEB - Informa que o método abaixo é do tipo POST (Cadastrar)
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados){
       medicoRepository.save(new Medico(dados));

    }

    @GetMapping
    public List<DadosListagemMedico> listarMedicos() {
        return 
    }
    

}
