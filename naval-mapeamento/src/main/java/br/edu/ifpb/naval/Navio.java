
package br.edu.ifpb.naval;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 19/10/2017
 */

@Entity
@SequenceGenerator(name = "navio_seq", sequenceName = "navio_seq")
public class Navio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "navio_seq")
    private int codNavio;
    @Column(length = 50, nullable = false)
    private String nome;
    @Column(precision = 2, nullable = false)
    private double capacidade;
    @Column(length = 20, nullable = false)
    private String pais;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Comandante comandante;

    public Navio() {
    }

    public Navio(String nome, double capacidade, String pais) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.pais = pais;
    }

    public int getCodNavio() {
        return codNavio;
    }

    public void setCodNavio(int codNavio) {
        this.codNavio = codNavio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Comandante getComandante() {
        return comandante;
    }

    public void setComandante(Comandante comandante) {
        this.comandante = comandante;
    }
    
}
