package br.com.vollmed.api.model.paciente;

import br.com.vollmed.api.model.endereco.Endereco;

public record DadosCadastroPaciente(
        String nomeCompleto,
        String email,
        String telefone,
        String cpf,
        Endereco endereco
) {


}