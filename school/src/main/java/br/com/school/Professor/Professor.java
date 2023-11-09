package br.com.school.Professor;


import br.com.school.Curso.Disciplina;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "professores")
@Entity(name = "Professores")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode (of = "id")
public class Professor {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Nome")
    private String nome;
    @Enumerated(EnumType.STRING)
    private Disciplina disciplina;
    public Professor( DadosCadastroProfessor dados) {
        this.nome = dados.nome();
        this.disciplina = dados.disciplina();
    }
}
