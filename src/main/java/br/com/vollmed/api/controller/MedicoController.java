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

    // Prática ruim, só para fins de teste
    // Get que devolve todas as informações de todos os medicos
    @GetMapping("Todos")
    public List<Medico> listarTodos() {
        return medicoRepository.findAll();
    }
    
    // @GetMapping("listar")
    // public List<DadosListagemMedico> listarRegraNegocio() {
    //     return medicoRepository.findAll();

        // findAll() -> Método que retorna uma lista de objetos do tipo DadosListagemMedico
        // strem() -> Método utilizado para tranformar uma lista em um fluxo de dados permitindo aplicar operações de transformação
        // map() -> Método utilizado para conveter cada objeto do tipo médico em um json DadosLisagemMedico utilizando o construtor que criamos 
        // em DadosLisagemMedico. 
        // toList() -> Método utilizado para coletar os resultados em uma nova Lista do tipo DadosListagemMedico que é formato que queremos retornar para nossa API
        // DadosListagemMedico::new -> O construtor (método de referência) que está no record DadosListagemMedico. 
    // }
    
    
    

}
