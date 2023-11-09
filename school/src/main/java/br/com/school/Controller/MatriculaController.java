package br.com.school.Controller;


import br.com.school.Matricula.DadosMatricula;
import br.com.school.Matricula.Matricula;
import br.com.school.Matricula.MatriculaRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("matriculas")
public class MatriculaController {
    @Autowired
    private MatriculaRepository repository;
    @RequestMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosMatricula dados){
        repository.save(new Matricula(dados));

    }
}
