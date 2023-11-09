package br.com.school.Controller;

import br.com.school.Aluno.Aluno;
import br.com.school.Aluno.AlunoRepository;
import br.com.school.Aluno.DadosCadastroAluno;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("alunos")
public class AlunoController {
    @Autowired
    private AlunoRepository repository;
    @RequestMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroAluno dados){
        repository.save(new Aluno(dados));
    }
}
