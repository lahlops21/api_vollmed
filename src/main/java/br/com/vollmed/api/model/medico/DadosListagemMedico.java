package br.com.vollmed.api.model.medico;

public record DadosListagemMedico(
        
        Integer id,
        String nome,
        String email,
        String crm,
        Especialidade especialidade

) {
    
}
