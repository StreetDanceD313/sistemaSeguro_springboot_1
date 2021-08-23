package pucpr.br.servico;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoResource {

    @GetMapping("/consulta/{id}")
    public Aluno consulta(@PathVariable("id") int id){
        return new Aluno(id,"Carlos", "1234");
    }

    @PostMapping
    public Aluno incluir(@RequestBody Aluno aluno){
        return aluno;
    }

}
