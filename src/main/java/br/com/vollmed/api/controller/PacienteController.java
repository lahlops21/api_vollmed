package br.com.vollmed.api.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.vollmed.api.model.paciente.DadosCadastroPaciente;
import br.com.vollmed.api.model.paciente.DadosListagemPaciente;
import br.com.vollmed.api.model.paciente.Paciente;
import br.com.vollmed.api.model.paciente.PacienteRepository;
import jakarta.transaction.Transactional;


@RestController // Spring Web - Informa para o Spring Boot que a classe é um controller(GET/POST/PUT/DELETE) pois não temos front-end. 
@RequestMapping("pacientes")
public class PacienteController {
   
    // @PostMapping // SPRING WEB - Informa que o método abaixo é do tipo POST (Cadastrar)
    // public void cadastrar(String dados){
    // //    medicoRepository.save(new Medico(dados));
    //     System.out.println(dados);

    @Autowired
    private PacienteRepository pacienteRepository;

    @PostMapping
    @Transactional // Alterações no banco de dados
    private void cadastrar(@RequestBody DadosCadastroPaciente dados){
        pacienteRepository.save(new Paciente(dados));
    }

    // Get que devolve todas as informações de todos os pacientes
    @GetMapping("listar")
    public List<Paciente> listarTodos(){
        return pacienteRepository.findAll();
    }
    //GET
    // POST 
    // PUT 
    // DELETE

}
