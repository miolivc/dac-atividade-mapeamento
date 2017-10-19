
package br.edu.ifpb.filmes.core;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 01/10/2017
 */

@Entity
@SequenceGenerator(name = "evento_seq", sequenceName = "evento_seq")

public class Evento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "evento_seq")
    private int codigo;
    
    @Column(length = 100, nullable = false)
    private String nome;
    
    @Column(length = 150, nullable = false)
    private String local;
    
    @Column(nullable = false, columnDefinition = "DECIMAL(4)")
    private int ano;

    public Evento() {
    }

    public Evento(String nome, String local, int ano) {
        this.nome = nome;
        this.local = local;
        this.ano = ano;
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

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
}
