
package br.edu.ifpb.filmes.core;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 01/10/2017
 */

@Entity
@Table(name = "Filme_Evento")
public class FilmeEvento implements Serializable {
    
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    private Filme filme;
    
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    private Evento evento;
    
    @Column(precision = 1)
    private double nota; 

    public FilmeEvento() {
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
}
