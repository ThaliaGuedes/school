package br.com.school.Professor;

import br.com.school.Curso.Disciplina;
import jakarta.persistence.Embedded;
import jakarta.validation.Valid;

public record DadosCadastroProfessor(
        String nome,
        @Valid
        @Embedded
        Disciplina disciplina
) {
}
