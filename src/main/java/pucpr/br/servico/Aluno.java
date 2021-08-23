package pucpr.br.servico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aluno")
public class Aluno {

    @Id
    @GeneratedValue
    private int     id;
    private String  nome;
    private String  matricula;

    public Aluno(int id,String nome,String matricula){
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
    }
    public Aluno(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
