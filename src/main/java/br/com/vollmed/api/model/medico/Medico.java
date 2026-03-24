package br.com.vollmed.api.model.medico;

import jakarta.persistence.Entity;

@Entity
public class Medico {
    
    // atributos -> caracteríticas -> variáveis 
    String nome;
    String email;
    String telefone;
    String crm;
    Especialidade especialidade;
}

