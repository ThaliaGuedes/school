package br.com.school.Controller;


import br.com.school.Professor.DadosCadastroProfessor;
import br.com.school.Professor.Professor;
import br.com.school.Professor.ProfessorRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("professores")
public class ProfessorController {
    @Autowired
    private ProfessorRepository repository;
    @RequestMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProfessor dados){
        repository.save(new Professor(dados));
    }
}
