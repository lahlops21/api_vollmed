package br.com.vollmed.api.model.Consulta;

import br.com.vollmed.api.model.medico.Medico;
import br.com.vollmed.api.model.paciente.Paciente;

import java.time.LocalDate;
import java.time.LocalTime;


public record DadosCadastroConsulta(
        Medico medico,
        Paciente paciente,
        LocalDate data,
        LocalTime hora,
        StatusConsulta status
        )
{
}
