package br.com.vollmed.api.model.medico;

import jakarta.persistence.*;
import lombok.*;

@Entity // SPRING JPA - Informa que a classe abaixo é uma entidade, ou seja, será uma tabela no BD. 
@Table(name = "medicos") // SPRING JPA = (OPCIONAL) Altera o nome da tabela de medico para médicos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {
    
    // atributos -> caracteríticas -> variáveis 
    @Id // SPRING JPA - Informa ao banco de dados que a pk é o id. 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    
    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;
    // private Endereco endereco;
 
    // método construtor que recebe a classe DTO e converte para atualiza com as conversões
    public Medico(DadosCadastroMedico dados){

        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone  = dados.telefone();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();


    }
}


