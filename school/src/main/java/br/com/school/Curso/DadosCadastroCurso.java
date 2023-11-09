package br.com.school.Curso;


import br.com.school.Professor.Professor;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCurso(
        String nomeCurso,
        @Valid
        @NotNull(message = "O campo 'ProfessorResponsavel' não deve ser nulo")
        Professor professor
) {
}
