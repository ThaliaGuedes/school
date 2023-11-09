package br.com.school.Matricula;



import br.com.school.Aluno.Aluno;
import br.com.school.Curso.Curso;

import java.util.Date;

public record DadosMatricula(
        Aluno aluno,
        Curso curso,
        Date dataMatricula
) {
}
