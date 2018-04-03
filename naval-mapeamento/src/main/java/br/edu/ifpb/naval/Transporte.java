package br.edu.ifpb.naval;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
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
    @OneToMany(cascade = CascadeType.PERSIST)
//    @CollectionTable
//    @ElementCollection
    private List<Produto> produtos;
    @Column(columnDefinition = "TIMESTAMP")
    @Temporal(TemporalType.DATE)
    private Date data;
    @Column(nullable = false, precision = 2)
    private double valor;

    public Transporte() {
    }

    public Transporte(Navio navio, Carga carga, Date data, double valor) {
        this.produtos = new ArrayList<>();
        this.navio = navio;
        this.carga = carga;
        this.data = data;
        this.valor = valor;
    }

    public Transporte(Date data, double valor) {
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

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
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

    @Override
    public String toString() {
        return "Transporte{" + "navio=" + navio + ", carga=" + carga + ", produtos=" + produtos + ", data=" + data + ", valor=" + valor + '}';
    }

}
