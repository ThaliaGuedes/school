package br.com.school.Curso;


import br.com.school.Professor.Professor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "cursos")
@Entity(name = "Cursos")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NomeCurso")
    private String nomeCurso;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ProfessorResponsavel")
    private Professor professorResponsavel;

    public Professor getProfessorResponsavel() {
        return professorResponsavel;
    }

    public void setProfessorResponsavel(Professor professorResponsavel) {
        this.professorResponsavel = professorResponsavel;
    }

    public Curso(DadosCadastroCurso dados) {
        this.nomeCurso = dados.nomeCurso();
        this.professorResponsavel = dados.professor();
    }
}
