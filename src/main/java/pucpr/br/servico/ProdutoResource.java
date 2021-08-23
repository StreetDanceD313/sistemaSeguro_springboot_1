package pucpr.br.servico;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @GetMapping("/{id}")
    public Produto consultaId(@PathVariable("id") int id){
        return new Produto(id, "Produto Teste", 2021, "1982679182467910824");
    }

    @GetMapping("/")
    public Produto[] consultaTodos(){
        Produto[] produtos = new Produto[5];
        produtos[0] = new Produto(1, "Produto Teste 1", 2021, "1982679182467910824");
        produtos[1] = new Produto(2, "Produto Teste 2", 1908, "1982679182467910824");
        produtos[2] = new Produto(3, "Produto Teste 3", 1980, "1982679182467910824");
        return produtos;
    }

    @PostMapping
    public Produto incluir(@RequestBody Produto produto){
        return produto;
    }

    @PutMapping
    public Produto alterar(@RequestBody Produto produto){
        return produto;
    }

    @DeleteMapping("/{id}")
    public Produto delete(@PathVariable("id") int id){
        return new Produto(3, "Produto Teste 3", 1980, "1982679182467910824");
    }
}
