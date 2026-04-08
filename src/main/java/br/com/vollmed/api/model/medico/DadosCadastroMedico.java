package br.com.vollmed.api.model.medico;

import br.com.vollmed.api.model.endereco.Endereco;

public record DadosCadastroMedico(

        String nome,
        String email,
        String telefone,
        String crm,
        Especialidade especialidade
    
    ) {
    // Essa classe é responsável por pegar os 
    // dados que estão vindo do simulador de requisição 
    // e transformar de JSON -> DTO <- em objeto para a API


    // RECORD -> Já cria toos os getters, setters, constructors, hashcode e equals
    // Inclusive já deixa todos os atributos privates

}


