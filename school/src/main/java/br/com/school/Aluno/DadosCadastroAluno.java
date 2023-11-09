package br.com.school.Aluno;

import br.com.school.Endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroAluno(
        @NotBlank
        String nome,
        @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data de nascimento deve estar no formato AAAA-MM-DD")
        String dataNascimento,
        @NotNull(message = "O campo 'endereco' não deve ser nulo")
        @Valid
        DadosEndereco endereco
) {
}

