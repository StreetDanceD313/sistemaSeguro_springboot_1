package pucpr.br.servico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue
    private int ID;
    private String NOME;
    private int ANOFABRICACAO;
    private String EAN;

    public Produto() {
    }

    public Produto(int ID, String NOME, int ANOFABRICACAO, String EAN) {
        this.ID = ID;
        this.NOME = NOME;
        this.ANOFABRICACAO = ANOFABRICACAO;
        this.EAN = EAN;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public int getANOFABRICACAO() {
        return ANOFABRICACAO;
    }

    public void setANOFABRICACAO(int ANOFABRICACAO) {
        this.ANOFABRICACAO = ANOFABRICACAO;
    }

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
    }
}
