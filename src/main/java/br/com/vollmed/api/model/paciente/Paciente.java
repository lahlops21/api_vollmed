package br.com.vollmed.api.model.paciente;

import br.com.vollmed.api.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "pacientes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Paciente {
    
    private String nome;
    private String email;
    private String telefone;
    private String cpf;
    private Endereco endereco;
    private int status;
}
