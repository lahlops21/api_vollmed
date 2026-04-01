package br.com.vollmed.api.model.medico;

import br.com.vollmed.api.model.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Entity // SPRING JPA - Informa que a classe abaixo é uma entidade, ou seja, será uma tabela no BD. 
@Table(name = "medicos") // SPRING JPA = (OPCIONAL) Altera o nome da tabela de medico para médicos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Medico {
    
    // atributos -> caracteríticas -> variáveis 
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private Especialidade especialidade;
    private Endereco endereco;
    private int status;
}


