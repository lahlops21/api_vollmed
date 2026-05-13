package br.com.vollmed.api.model.paciente;

import br.com.vollmed.api.model.endereco.Endereco;
import br.com.vollmed.api.model.medico.DadosCadastroMedico;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Paciente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    @Embedded
    private Endereco endereco;

    // método construtor que recebe a classe DTO e converte para atualiza com as conversões
    public Paciente(DadosCadastroPaciente dados){

        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone  = dados.telefone();
        this.cpf = dados.cpf();
        this.endereco = new Endereco(dados.endereco());


    }
}
