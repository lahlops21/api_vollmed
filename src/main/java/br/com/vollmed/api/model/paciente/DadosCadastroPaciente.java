package br.com.vollmed.api.model.paciente;


public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf
) {


}