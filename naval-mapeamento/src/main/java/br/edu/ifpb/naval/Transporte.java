
package br.edu.ifpb.naval;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 19/10/2017
 */

@Entity
public class Transporte implements Serializable {
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    private Navio navio;
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    private Carga carga;
    @Id
    @OneToOne(cascade = CascadeType.PERSIST)
    private Produto produto; 
    @Column(columnDefinition = "TIMESTAMP")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(nullable = false, precision = 2)
    private double valor;

    public Transporte() {
    }

    public Transporte(Navio navio, Carga carga, Date data, double valor) {
        this.navio = navio;
        this.carga = carga;
        this.data = data;
        this.valor = valor;
    }

    public Navio getNavio() {
        return navio;
    }

    public void setNavio(Navio navio) {
        this.navio = navio;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    public Produto getProdutos() {
        return produto;
    }

    public void setProdutos(Produto produtos) {
        this.produto = produtos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
