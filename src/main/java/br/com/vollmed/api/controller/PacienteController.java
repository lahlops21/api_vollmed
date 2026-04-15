package br.com.vollmed.api.controller;
import org.springframework.web.bind.annotation.*;

import br.com.vollmed.api.model.paciente.DadosCadastroPaciente;


@RestController // Spring Web - Informa para o Spring Boot que a classe é um controller(GET/POST/PUT/DELETE) pois não temos front-end. 
@RequestMapping("pacientes")
public class PacienteController {
   
    @PostMapping // SPRING WEB - Informa que o método abaixo é do tipo POST (Cadastrar)
    public void cadastrar(String dados){
    //    medicoRepository.save(new Medico(dados));
        System.out.println(dados);

}
}