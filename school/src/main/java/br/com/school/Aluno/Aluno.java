package br.com.school.Aluno;

import br.com.school.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "alunos")
@Entity(name = "Alunos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "DataNascimento")
    private String dataNascimento;

    @Embedded
    private Endereco endereco;
    public Aluno(DadosCadastroAluno dados) {
        this.nome = dados.nome();
        this.dataNascimento = dados.dataNascimento();
        this.endereco = new Endereco(dados.endereco());
    }
}
