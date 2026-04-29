package br.com.vollmed.api.model.paciente;

import br.com.vollmed.api.model.endereco.DadosCadastroEndereco;

public record DadosCadastroPaciente(
        String nome,
        String email,
        String telefone,
        String cpf,
        DadosCadastroEndereco endereco
) {


}