
package br.edu.ifpb.filmes.core;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "ator_seq", sequenceName = "ator_seq")

public class Ator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ator_seq")
    private int codigo;
    
    @Column(length = 40, nullable = false)
    private String nome;
    
    @Column(length = 10, nullable = false)
    private String sexo;
    
    @Column(length = 20, nullable = false)
    private String nacionalidade;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Ator ator;

    public Ator() {
    }

    public Ator(String nome, String sexo, String nacionalidade) {
        this.nome = nome;
        this.sexo = sexo;
        this.nacionalidade = nacionalidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Ator getAtor() {
        return ator;
    }

    public void setAtor(Ator ator) {
        this.ator = ator;
    }
    
}
