package br.com.vollmed.api.model.Consulta;

import br.com.vollmed.api.model.medico.Medico;
import br.com.vollmed.api.model.paciente.Paciente;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity // SPRING JPA - Informa que a classe abaixo é uma entidade, ou seja, será uma tabela no BD.
@Table(name = "consulta") // SPRING JPA = (OPCIONAL) Altera o nome da tabela de medico para médicos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Consulta {

    private int id;
    // @ManyToOne
    // @JoinColumn(name = "medico_id")
    private Medico medico;
    // @ManyToOne
    // @JoinColumn(name = "paciente_id")
    private Paciente paciente;
    private LocalDate data;
    private LocalTime hora;
    private StatusConsulta statusConsulta;
    int status;
}

